package org.example;

public class Cell {
    int row;
    int col;
    Piece piece;
    Cell(int row, int col, Piece piece){
        this.row = row;
        this.col = col;
        this.piece = piece;
    }
    Cell(int row, int col){
        this.row = row;
        this.col = col;
    }
}
