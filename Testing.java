/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 321, Spring 2021
/* Assignment:  Connect 4
/* File:        Testing
/*****************************************************************************/
public class Testing {
    public static void main(String[] args) {
    
        //Testing of class Player
        Player player1 = new Player(1, "Filip", "Red");
        System.out.println(player1.getId());
        System.out.println(player1.getName());
        System.out.println(player1.getColor());
        player1.setId(2);
        player1.setName("Mark");
        player1.setColor("Green");
        System.out.println(player1.getId());
        System.out.println(player1.getName());
        System.out.println(player1.getColor());
        
        //Testing of class Board
        Board b1 = new Board();
        b1.setPosition(2, 2, 3);
        System.out.println(b1.getPosition(2, 2));
        System.out.println(b1.isOver());
        System.out.println(b1.isWin());
        System.out.println(b1.isDraw());
        System.out.println(b1.display());
        b1.placeMove(0, player1.getId());
        System.out.println(b1.getPosition(5, 0));
        System.out.println(b1.checkLegal(2));
        System.out.println(b1.checkDraw());
        System.out.println(b1.checkWin(2));
        b1.placeMove(0, player1.getId());
        b1.placeMove(0, player1.getId());
        b1.placeMove(0, player1.getId());
        System.out.println(b1.checkWin(2));
        System.out.println(b1.isWin());
        System.out.println(b1.isOver());
    }
}