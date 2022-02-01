/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 321, Spring 2021
/* Assignment:  Connect 4
/* File:        Game
/*****************************************************************************/
import java.util.Scanner;

public class Game {
    //field variables
    private Board b;
    private Player p1, p2, cur;
    
    //constructors
    public Game(String name1, String color1, String name2, String color2) {
        b = new Board();
        p1 = new Player(1, name1, color1);
        p2 = new Player(2, name2, color2);
        
        cur = p1;
    }
    
    public Game() {
        String name, color;
        Scanner in;
        
        b = new Board();
        in = new Scanner(System.in);
        
        System.out.println("Insert name for the first player: ");
        name = in.nextLine();
        p1 = new Player(1, name, "");
        
        System.out.println("Insert name for the second player: ");
        name = in.nextLine();
        p2 = new Player(2, name, "");
        
        cur = p1;
        System.out.println(b.display());
    }
    
    public String getCur() {
        return cur.getName();
    }
    
    public String getColor(int id) {
        if (p1.getId() == id) {
            return p1.getColor();
        }
        else {
            return p2.getColor();
        }
    }
    
    //methods
    //put the move in the inputed column
    public void makeMove() {
            b.placeMove(inputColumn(), cur.getId());
    }
    
    //put the move in the given column
    public int makeMove(int column) {
        int place;
    
        place = b.placeMove(column, cur.getId());
        if (place != -1) {
            switchPlayer();
        }
        
        return place;
    }
    
    //display the board
    public String display() {
        return b.display();
    }
    
    //access board instance
    public Board getBoard() {
        return b;
    }
    
    //message for when the game is done
    public String gameOver() {
        if(b.isWin()) {
            return cur.getName() + " WON!";
        }
        else if(b.isDraw()) {
            return "DRAW!";
        }
        return "";
    }
    
    //checking for if the game is done
    public boolean end() {
        if(b.isWin() || b.isDraw()) {
            return true;
        }
        return false;
    }
    
    //switch current player
    public void switchPlayer() {
        if (cur.getId() == 1) {
            cur = p2;
        }
        else {
            cur = p1;
        }
    }
    
    //get the column as an input from user
    public int inputColumn() {
        Scanner in;
        int column;
        
        in = new Scanner(System.in);
        try {
            System.out.println(cur.getName() + "'s turn." +
                                "Enter a column(0-" + (b.COL-1) + "): ");
            column = in.nextInt();
            while (column < 0 || column > b.COL) {
                System.out.println("Wrong input! Try again.");
                System.out.println(cur.getName() + "'s turn." +
                                    "Enter a column(0-" + (b.COL-1) + "): ");
                column = inputColumn();
            }
            while (!b.checkLegal(column)) {
                System.out.println("That column is full! Try another one.");
                column = inputColumn();
            }
        }
        catch(Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("Wrong input! Try again.");
            in.nextLine();
            column = inputColumn();
        }
        return column;
    }
}