/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 321, Spring 2021
/* Assignment:  Connect 4
/* File:        Board interface
/*****************************************************************************/
public interface BoardInterface {
    public int getPosition(int i, int j);
    public void setPosition(int i, int j, int value);
    public boolean isOver();
    public boolean isWin();
    public boolean isDraw();
    public String display();
    public boolean checkDraw();
    public boolean checkWin(int player);
}