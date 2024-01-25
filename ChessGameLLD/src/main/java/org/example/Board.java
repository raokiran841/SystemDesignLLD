package org.example;

import java.util.Arrays;

public class Board {
    Cell[][] board;
    Board(int size){
        this.board = new Cell[size][size];
    }

    public boolean move(Player playerTurn, Cell start, Cell end){
        if(validateMove(playerTurn, start, end)){
            Cell startCell = board[start.row][start.col];
            Cell endCell = board[end.row][end.col];
            if(!endCell.piece.pieceType.equals(PieceType.EMPTY)){
                endCell.piece.alive = false;
            }
            endCell.piece = startCell.piece;
            startCell.piece = new Piece(PieceType.EMPTY, null);
            System.out.println(displayBoard());
            return true;
        }
        return false;
    }

    private boolean validateMove(Player playerTurn, Cell start, Cell end){
        //validate move (piece alive, move is valid accrdng to piece)
        Cell currCell = board[start.row][start.col];
        if(currCell.piece.pieceType.equals(PieceType.EMPTY)){
            System.out.println("Cell is empty, no piece to move, choose again");
            return false;
        }
        Color currPlayerColor = playerTurn.color;
        if(!currPlayerColor.equals(currCell.piece.color)){
            System.out.println("That's not your piece, choose again");
            return false;
        }
        return true;
    }

    public void setCell(Cell cell){
        board[cell.row][cell.col] = cell;
    }

    public void fillEmptyCells() {
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(board[i][j] == null){
                    board[i][j] = new Cell(i,j, new Piece(PieceType.EMPTY, null));
                }
            }
        }
    }

    public String displayBoard() {
        String boardStr = "";
        for(int i=0; i<8; i++){
            boardStr += "[";
            for(int j=0; j<8; j++){
                boardStr += board[i][j].piece.toString();
            }
            boardStr += "\b]\n";
        }
        return boardStr;
    }
}
