/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 321, Spring 2021
/* Assignment:  Connect 4
/* File:        Board class
/*****************************************************************************/
public class Board implements BoardInterface{
    //constants
    public final static int ROW = 6;
    public final static int COL = 7;
    public final static int WIN = 4;
    
    //field variables
    private int[][] field;
    private boolean end, win, draw;
    private BoardIterator iter;
    
    //constructor
    public Board() {
        field = new int[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                field[i][j] = 0;
            }
        }
        end = false;
        win = false;
        draw = false;
    }
    
    //accessors
    public int getPosition(int i, int j) {
        return field[i][j];
    }
    
    //mutators
    public void setPosition(int i, int j, int value) {
        field[i][j] = value;
    }
    
    //methods
    //return if game is over, either win or draw
    public boolean isOver() {
        return end;
    }
    
    //return if game is won
    public boolean isWin() {
        return win;
    }
    
    //return if game if draw
    public boolean isDraw() {
        return draw;
    }
    
    //display the board
    public String display() {
        String s;
        
        s = "";
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                s += field[i][j];
            }
            s+= "\n";
        }
        return s;
    }
    
    //put the move by given player in a given column 
    public int placeMove(int column, int player) {
        int i;
        boolean last;
        
        last = true;
        if (checkLegal(column)) {
            for (i = 0; i < ROW - 1; i++) {
                if (field[i+1][column] != 0) {
                    field[i][column] = player;
                    last = false;
                    checkWin(player);
                    checkDraw();
                    return i;
                }
            }
            if (last) {
                field[i][column] = player;
                checkWin(player);
                checkDraw();
                return i;
            }
        }
        return -1;
    }
    
    //check if the column is full
    public boolean checkLegal(int column) {
        if (field[0][column] != 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    //check if all the fields are filled without winner
    public boolean checkDraw() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (field[i][j] == 0) {
                    return false;
                }
            }
        }
        draw = true;
        end = true;
        return true;
    }
    
    //check whole board for if the given player has 4 pieces connected
    public boolean checkWin(int player) {
        int count, cur;
        
        count = 0;
        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < COL; j++) {
                for(int x = 1; x < 9; x++) {
                    count = 0;
                    iter = new BoardIterator(field, i, j, x);
                    while(iter.hasNext() && count < WIN) {
                        if(iter.next() == player) count++;
                        else break;
                    }
                    if(count == WIN) {
                        win = true;
                        end = true;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}