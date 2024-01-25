package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> players;

    public void initializeGame(){
        players = new ArrayDeque<>();
        //♖♘♗♔♕♗♘♖
        //♙♙♙♙♙♙♙♙
        //
        //♟♟♟♟♟♟♟♟
        //♜♞♝♚♛♝♞♜
        board = new Board(8);
        // init pawn
        int k=7;
        while(k>=0){
            board.setCell(new Cell(1, k, new Piece(PieceType.PAWN, Color.WHITE))); k--;
        }
        k=7;
        while(k>=0){
            board.setCell(new Cell(6, k, new Piece(PieceType.PAWN, Color.BLACK))); k--;
        }
        // init king and queen
        board.setCell(new Cell(0, 3, new Piece(PieceType.KING, Color.WHITE)));
        board.setCell(new Cell(7, 3, new Piece(PieceType.KING, Color.BLACK)));
        board.setCell(new Cell(0,4, new Piece(PieceType.QUEEN, Color.WHITE)));
        board.setCell(new Cell(7,4, new Piece(PieceType.QUEEN, Color.BLACK)));

        //init rook
        board.setCell(new Cell(0,0, new Piece(PieceType.ROOK, Color.WHITE)));
        board.setCell(new Cell(0,7, new Piece(PieceType.ROOK, Color.WHITE)));
        board.setCell(new Cell(7,0, new Piece(PieceType.ROOK, Color.BLACK)));
        board.setCell(new Cell(7,7, new Piece(PieceType.ROOK, Color.BLACK)));
        //init bishop
        board.setCell(new Cell(0,2, new Piece(PieceType.BISHOP, Color.WHITE)));
        board.setCell(new Cell(0,5, new Piece(PieceType.BISHOP, Color.WHITE)));
        board.setCell(new Cell(7,2, new Piece(PieceType.BISHOP, Color.BLACK)));
        board.setCell(new Cell(7,5, new Piece(PieceType.BISHOP, Color.BLACK)));
        //init knight
        board.setCell(new Cell(0,1, new Piece(PieceType.KNIGHT, Color.WHITE)));
        board.setCell(new Cell(0,6, new Piece(PieceType.KNIGHT, Color.WHITE)));
        board.setCell(new Cell(7,1, new Piece(PieceType.KNIGHT, Color.BLACK)));
        board.setCell(new Cell(7,6, new Piece(PieceType.KNIGHT, Color.BLACK)));

        board.fillEmptyCells();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st player name: ");
        String name = sc.next();
        Player player1 = new Player(name,Color.WHITE);
        System.out.println(name + " you will play with white color.\nEnter 2nd player name: ");
        name = sc.next();
        Player player2 = new Player(name,Color.BLACK);
        players.add(player1);
        players.add(player2);
    }
    public String startGame() {
        System.out.println(board.displayBoard());
        boolean gameWon = false;
        Scanner sc = new Scanner(System.in);
        while (!gameWon){
            Player playerTurn = players.pollFirst();
            //input move
            System.out.println(playerTurn.name+"("+playerTurn.color+"), please place a move \n(startRow, startCol, endRow, endCol)");
            String moveInp = sc.next();
            String[] movesStr = moveInp.split(",");
            int startRow = Integer.valueOf(movesStr[0]);
            int startCol = Integer.valueOf(movesStr[1]);
            int endRow = Integer.valueOf(movesStr[2]);
            int endCol = Integer.valueOf(movesStr[3]);
            //validate move (piece alive, move is valid accrdng to piece)
            if(!board.move(playerTurn, new Cell(startRow, startCol), new Cell(endRow, endCol))){
               players.addFirst(playerTurn);
               continue;
            }
            //check for check, checkmate and stalemate
            //if checkmate player turn wins.
            players.addLast(playerTurn);
        }
        return "stalemate";
    }
}

