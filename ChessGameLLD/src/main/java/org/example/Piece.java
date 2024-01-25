package org.example;

public class Piece {
    PieceType pieceType;
    Color color;

    boolean alive;

    Piece(PieceType pieceType, Color color){
        this.pieceType = pieceType;
        this.color =color;
        this.alive = true;
    }

    public String toString(){
        return color == null ? " "+pieceType.white+" |" : (color.equals(Color.WHITE) ? " "+pieceType.white+" |" : " "+pieceType.black+" |");
    }
}
