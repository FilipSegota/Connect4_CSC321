/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 321, Spring 2021
/* Assignment:  Connect 4
/* File:        Player class
/*****************************************************************************/
public class Player{
    //field variables
    private int id;
    private String name;
    private String color;
    
    //constructor
    public Player(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
    
    //accessors
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    
    //mutators
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
}