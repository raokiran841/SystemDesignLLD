package org.example;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.initializeGame();
        String result = game.startGame();
        System.out.println(result+" WON the game");
        System.out.println("===================================");
    }
}