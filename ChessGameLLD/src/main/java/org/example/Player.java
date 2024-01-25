package org.example;

public class Player {
    Color color;
    String name;
    boolean win;
    Player(String name, Color color){
        this.color = color;
        this.name = name;
        this.win = false;
    }
}
