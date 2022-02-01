/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 321, Spring 2021
/* Assignment:  Connect 4
/* File:        Driver
/*****************************************************************************/
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //field variables
        Game g;
        
        //create instance of class Game
        g = new Game();
        
        //run the game until it's over
        while(!g.end()) {
            //make a move
            g.makeMove();
            //print out the board
            System.out.println(g.display());
            //switch current player
            g.switchPlayer();
        }
        //print out the end message
        System.out.println(g.gameOver());
    }
}