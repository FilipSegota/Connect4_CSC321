/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 321, Spring 2021
/* Assignment:  Connect 4
/* File:        Iterator class
/*****************************************************************************/
import java.util.Iterator;

public class BoardIterator implements Iterator<Integer> {
    //field variables
    private int dir, x, y, cur;
    private int[][] field;
    
    //constructor
    public BoardIterator(int[][] field, int x, int y, int dir) {
        this.field = field;
        this.x = x;
        this.y = y;
        cur = field[x][y];
        this.dir = dir;
    }
    
    //methods
    //change of X depending on given direction
    public int changeX(int dir) {
        switch(dir){
            case 1:
            case 2:
            case 8:
                return -1;
            case 3:
            case 7:
                return 0;
            case 4:
            case 5:
            case 6:
                return 1;
        }
        return 0;
    }
    
    //change of Y depending on given direction
    public int changeY(int dir) {
        switch(dir){
            case 6:
            case 7:
            case 8:
                return -1;
            case 1:
            case 5:
                return 0;
            case 2:
            case 3:
            case 4:
                return 1;
        }
        return 0;
    }
    
    //check if there is any piece anywhere around the current position
    public boolean hasNext() {
        if(x + changeX(dir) < 0 || x + changeX(dir) > 5 ||
            y + changeY(dir) < 0 || y + changeY(dir) > 6) {
            return false;         
           }
        else if(field[x + changeX(dir)][y + changeY(dir)] != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    //change the current to the next piece
    public Integer next() {
        if(x + changeX(dir) < 0 || x + changeX(dir) > 5 ||
            y + changeY(dir) < 0 || y + changeY(dir) > 6) {
            return null;         
           }
        else {
            x += changeX(dir);
            y += changeY(dir);
            cur = field[x][y];
            return cur;
        }
    }
}