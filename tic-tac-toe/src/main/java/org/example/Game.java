package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {

    private Board gameBoard;
    private Deque<Players> deque;

    private static final int size = 3;

    public static void main(String[] args) {
        System.out.println("================ WELCOME ==================X\b");
        Game g = new Game();
        g.initialiseGame(size);
        Players p = g.startGame();
        g.printBoard();
        if(p != null){
            System.out.println(p.toString()+" has WON, Congratulations !!");
            System.out.println("As reward "+p.name+" will fuck "+ g.deque.poll().name);
        } else {
            System.out.println("Both the players, go fuck yourself !");
        }
        System.out.println("===========================================");
    }

    private Players startGame(){
        boolean playerWon = false;
        Players player = null;

        while(!playerWon){
            player = deque.pollFirst();
            if(checkForTie()){
                break;
            }
            System.out.println(player.name+"(" +player.sign.name()+"), plz choose box (row, col):");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            String[] inpArr = input.split(",");
            int row = Integer.valueOf(inpArr[0]);
            int col = Integer.valueOf(inpArr[1]);
            if(row < 0 || row >= size || col < 0 || col >= size){
                System.out.println("Invalid box!, choose again");
                deque.addFirst(player);
                continue;
            }
            if(!gameBoard.setBoard(row, col, player)){
                System.out.println("Box already filled, choose again");
                deque.addFirst(player);
                continue;
            } else {
                deque.addLast(player);
            }
            if(checkForWin(row, col, player)){
                return player;
            }
            printBoard();
        }
        return null;
    }

    private boolean checkForTie() {
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(gameBoard.getBoard()[i][j] == null){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkForWin(int row, int col, Players player){

        boolean rowWin = true;
        boolean colWin = true;
        boolean diagonalWin = true;
        boolean antiDiagonalWin = true;

        // check rows
        for(int i=0; i<size; i++){
            if(gameBoard.getBoard()[row][i] == null || gameBoard.getBoard()[row][i] != player.sign){
                rowWin = false;
            }
        }
        // check cols
        for(int i=0; i<size; i++){
            if(gameBoard.getBoard()[i][col] == null || gameBoard.getBoard()[i][col] != player.sign){
                colWin = false;
            }
        }
        //check diagonals
        for(int i=0; i<size; i++){
            if(gameBoard.getBoard()[i][i] == null || gameBoard.getBoard()[i][i] != player.sign){
                diagonalWin = false;
            }
        }
        for(int i=0; i<size; i++){
            if(gameBoard.getBoard()[i][size - 1 - i] == null || gameBoard.getBoard()[i][size - 1 - i] != player.sign){
                antiDiagonalWin = false;
            }
        }
        return rowWin || colWin || diagonalWin || antiDiagonalWin;
    }

    private void printBoard(){
        System.out.println(gameBoard.display());
//        System.out.println(deque);
    }

    private void initialiseGame(int size) {
        gameBoard = new Board(size);
        deque = new ArrayDeque<>();
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        Deque<Character> signs = new ArrayDeque<>();
        signs.add('O');
        signs.add('X');

        while(counter <= 2){
            System.out.println("Player "+ counter+", enter your name:");
            String name = sc.next();
            System.out.println("Player "+ counter+", choose a sign: "+ signs.toString());
            String sign = sc.next();
            switch (sign){
                case "O":
                    if(signs.contains('O')){
                        deque.add(new PlayerO(name, Sign.O));
                        signs.remove('O');
                        counter++;
                    } else System.out.println("Choose from the given Symbols only !");
                    break;
                case "X" :
                    if(signs.contains('X')){
                        deque.add(new PlayerX(name, Sign.X));
                        signs.remove('X');
                        counter++;
                    } else System.out.println("Choose from the given Symbols only !");
                    break;
                default:
                    System.out.println("Choose from the given Symbols only !");
                    break;
            }
        }
        printBoard();
    }
}