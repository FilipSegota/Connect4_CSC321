/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 321, Spring 2021
/* Assignment:  Connect 4
/* File:        GUI Connect
/*****************************************************************************/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUIConnect extends JFrame {
    //GUI elements
    private JPanel informationPanel, gamePanel, empty;
    private JPanel group1, group2, group3, group4;
    private JButton start;
    private JLabel nameLabel1, nameLabel2, colorLabel1, colorLabel2, turn;
    private JTextField name1, name2;
    private ButtonGroup colorGroup1, colorGroup2;
    private JRadioButton color1, color2, color3, color4;
    private JButton col1, col2, col3, col4, col5, col6, col7;
    private JDialog dialog;
    private JLabel message;
    
    //Listeners
    private RadioChange1 radioChangeListener1;
    private RadioChange2 radioChangeListener2;
    private StartGame startGameListener;
    private Column1 column1Listener;
    private Column2 column2Listener;
    private Column3 column3Listener;
    private Column4 column4Listener;
    private Column5 column5Listener;
    private Column6 column6Listener;
    private Column7 column7Listener;
    
    //field variables
    private Game game;

    //constructor
    public GUIConnect() {
        setGraphics();
        gamePanel.setVisible(false);
        color1.setSelected(true);
        color4.setSelected(true);
    }
    
    //lsitener for change in radio buttons
    public class RadioChange1 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (color1.isSelected()) {
                color4.setSelected(true);
            }
            else if (color2.isSelected()) {
                color3.setSelected(true);
            }
        }
    }
    
    //lsitener for change in radio buttons
    public class RadioChange2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (color3.isSelected()) {
                color2.setSelected(true);
            }
            else if (color4.isSelected()) {
                color1.setSelected(true);
            }
        }
    }
    
    //Starting the game
    public class StartGame implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            gamePanel.removeAll();      
            
            game = new Game(name1.getText(), selectedColor(color1, color2), 
                               name2.getText(), selectedColor(color3, color4));
            
            turn.setText(game.getCur() + "'s turn");            
            paintField();
            gamePanel.revalidate();
            gamePanel.repaint();
            gamePanel.setVisible(true);
        }
    }
    
    //Listener for column button
    public class Column1 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int place;
        
            place = game.makeMove(0);
            if(place == -1) {
                dialog = new JDialog();
                message = new JLabel("That column is full! Try another one.");
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(250, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.getCur() + "'s turn");
            }
            else {
                paintField();
                turn.setText(game.getCur() + "'s turn");
            }
            
            if (game.end()) {
                disableButtons();
                game.switchPlayer();
                dialog = new JDialog();
                message = new JLabel(game.gameOver());
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(50, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.gameOver());
            }
        }
    }
    
    //Listener for column button
    public class Column2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int place;
        
            place = game.makeMove(1);
            if(place == -1) {
                dialog = new JDialog();
                message = new JLabel("That column is full! Try another one.");
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(250, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.getCur() + "'s turn");
            }
            else {
                paintField();
                turn.setText(game.getCur() + "'s turn");
            }
            
            if (game.end()) {
                disableButtons();
                game.switchPlayer();
                dialog = new JDialog();
                message = new JLabel(game.gameOver());
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(50, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.gameOver());
            }           
        }
    }
    
    //Listener for column button
    public class Column3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int place;
        
            place = game.makeMove(2);
            if(place == -1) {
                dialog = new JDialog();
                message = new JLabel("That column is full! Try another one.");
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(250, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.getCur() + "'s turn");
            }
            else {
                paintField();
                turn.setText(game.getCur() + "'s turn");
            }
            
            if (game.end()) {
                disableButtons();
                game.switchPlayer();
                dialog = new JDialog();
                message = new JLabel(game.gameOver());
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(50, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.gameOver());
            }
        }
    }
    
    //Listener for column button
    public class Column4 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int place;
        
            place = game.makeMove(3);
            if(place == -1) {
                dialog = new JDialog();
                message = new JLabel("That column is full! Try another one.");
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(250, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.getCur() + "'s turn");
            }
            else {
                paintField();
                turn.setText(game.getCur() + "'s turn");
            }
            
            if (game.end()) {
                disableButtons();
                game.switchPlayer();
                dialog = new JDialog();
                message = new JLabel(game.gameOver());
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(50, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.gameOver());
            }
        }
    }
    
    //Listener for column button
    public class Column5 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int place;
        
            place = game.makeMove(4);
            if(place == -1) {
                dialog = new JDialog();
                message = new JLabel("That column is full! Try another one.");
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(250, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.getCur() + "'s turn");
            }
            else {
                paintField();
                turn.setText(game.getCur() + "'s turn");
            }
            
            if (game.end()) {
                disableButtons();
                game.switchPlayer();
                dialog = new JDialog();
                message = new JLabel(game.gameOver());
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(50, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.gameOver());
            }
        }
    }
    
    //Listener for column button
    public class Column6 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int place;
        
            place = game.makeMove(5);
            if(place == -1) {
                dialog = new JDialog();
                message = new JLabel("That column is full! Try another one.");
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(250, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.getCur() + "'s turn");
            }
            else {
                paintField();
                turn.setText(game.getCur() + "'s turn");
            }
            
            if (game.end()) {
                disableButtons();
                game.switchPlayer();
                dialog = new JDialog();
                message = new JLabel(game.gameOver());
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(50, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.gameOver());
            }
        }
    }
    
    //Listener for column button
    public class Column7 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int place;
        
            place = game.makeMove(6);
            if(place == -1) {
                dialog = new JDialog();
                message = new JLabel("That column is full! Try another one.");
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(250, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.getCur() + "'s turn");
            }
            else {
                paintField();
                turn.setText(game.getCur() + "'s turn");
            }
            
            if (game.end()) {
                disableButtons();
                game.switchPlayer();
                dialog = new JDialog();
                message = new JLabel(game.gameOver());
                dialog.add(message, BorderLayout.CENTER);
                dialog.setSize(50, 100);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                turn.setText(game.gameOver());
            }
        }
    }
    
    //disabling all the column buttons
    public void disableButtons() {
        col1.setEnabled(false);
        col2.setEnabled(false);
        col3.setEnabled(false);
        col4.setEnabled(false);
        col5.setEnabled(false);
        col6.setEnabled(false);
        col7.setEnabled(false);
    }
    
    //painting the game field
    public void paintField() {
        gamePanel.removeAll();
        gamePanel.revalidate();
        gamePanel.repaint();
        Border blackline;
        
        blackline = BorderFactory.createLineBorder(Color.black);
        
        col1 = new JButton("Column 1");
        col2 = new JButton("Column 2");
        col3 = new JButton("Column 3");
        col4 = new JButton("Column 4");
        col5 = new JButton("Column 5");
        col6 = new JButton("Column 6");
        col7 = new JButton("Column 7");
        column1Listener = new Column1();
        column2Listener = new Column2();
        column3Listener = new Column3();
        column4Listener = new Column4();
        column5Listener = new Column5();
        column6Listener = new Column6();
        column7Listener = new Column7();
        col1.addActionListener(column1Listener);
        col2.addActionListener(column2Listener);
        col3.addActionListener(column3Listener);
        col4.addActionListener(column4Listener);
        col5.addActionListener(column5Listener);
        col6.addActionListener(column6Listener);
        col7.addActionListener(column7Listener);
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j == 0) {
                    gamePanel.add(col1);
                }
                else if (i == 0 && j == 1) {
                    gamePanel.add(col2);
                }
                else if (i == 0 && j == 2) {
                    gamePanel.add(col3);
                }
                else if (i == 0 && j == 3) {
                    gamePanel.add(col4);
                }
                else if (i == 0 && j == 4) {
                    gamePanel.add(col5);
                }
                else if (i == 0 && j == 5) {
                    gamePanel.add(col6);
                }
                else if (i == 0 && j == 6) {
                    gamePanel.add(col7);
                }
            }
        }
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 7; j++) {
                
                if (game.getBoard().getPosition(i, j) == 0) {
                    empty = new JPanel();
                    empty.setBorder(blackline);
                    gamePanel.add(empty);
                }
                else if (game.getBoard().getPosition(i, j) == 1) {
                    empty = new JPanel();
                    empty.setBorder(blackline);
                    empty.setBackground(Color.decode(game.getColor(1)));
                    gamePanel.add(empty);
                }
                else {
                    empty = new JPanel();
                    empty.setBorder(blackline);
                    empty.setBackground(Color.decode(game.getColor(2)));
                    gamePanel.add(empty);
                }
            }
        }
    }
    
    //getting the color that is selected
    public String selectedColor(JRadioButton b1, JRadioButton b2) {
        if(b1.isSelected()) return "#0000FF";
        else return "#FF0000";
    } 

    //setting up whole graphic
    public void setGraphics() {
        Container myPane;
        Border blackline;

        blackline = BorderFactory.createLineBorder(Color.black);
        myPane = getContentPane();
        myPane.setLayout(new GridLayout(2, 1));
        informationPanel = new JPanel();
        gamePanel = new JPanel();
        group1 = new JPanel();
        group2 = new JPanel();
        group3 = new JPanel();
        group4 = new JPanel();
        group1.setLayout(new GridLayout(1, 2));
        group2.setLayout(new GridLayout(1, 2));
        group3.setLayout(new GridLayout(1, 3));
        group4.setLayout(new GridLayout(1, 3));
        informationPanel.setBorder(blackline);
        gamePanel.setBorder(blackline);
        informationPanel.setLayout(new GridLayout(3, 5));
        gamePanel.setLayout(new GridLayout(7, 6));
        myPane.add(informationPanel);
        myPane.add(gamePanel);
        
        
        nameLabel1 = new JLabel("Player 1: ");
        nameLabel2 = new JLabel("Player 2: ");
        turn = new JLabel("");
        name1 = new JTextField();
        name2 = new JTextField();
        group1.add(nameLabel1);
        group1.add(name1);
        group2.add(nameLabel2);
        group2.add(name2);
        colorLabel1 = new JLabel("Color: ");
        colorLabel2 = new JLabel("Color: ");
        colorGroup1 = new ButtonGroup();
        color1 = new JRadioButton("Blue");
        color2 = new JRadioButton("Red");
        colorGroup1.add(color1);
        colorGroup1.add(color2);
        group3.add(colorLabel1);
        group3.add(color1);
        group3.add(color2);
        colorGroup2  = new ButtonGroup();
        color3 = new JRadioButton("Blue");
        color4 = new JRadioButton("Red");
        colorGroup2.add(color3);
        colorGroup2.add(color4);
        group4.add(colorLabel2);
        group4.add(color3);
        group4.add(color4);
        
        start = new JButton("Start New Game");
        startGameListener = new StartGame();
        start.addActionListener(startGameListener);
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                if (i == 0 && j == 1) {
                    informationPanel.add(group1);
                }
                else if (i == 0 && j == 3) {
                    informationPanel.add(group2);
                }
                else if (i == 1 && j == 1) {
                    informationPanel.add(group3);
                }
                else if (i == 1 && j == 3) {
                    informationPanel.add(group4);
                }
                else if (i == 2 && j == 2) {
                    informationPanel.add(start);
                }
                else if (i == 2 && j == 4) {
                    informationPanel.add(turn);
                }
                else {
                    empty = new JPanel();
                    informationPanel.add(empty);
                }
            }
        }
        
        radioChangeListener1 = new RadioChange1();
        radioChangeListener2 = new RadioChange2();
        color1.addActionListener(radioChangeListener1);
        color2.addActionListener(radioChangeListener1);
        color3.addActionListener(radioChangeListener2);
        color4.addActionListener(radioChangeListener2);
    
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1000,700);
        setVisible(true);
    }
}