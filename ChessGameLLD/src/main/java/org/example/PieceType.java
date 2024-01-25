package org.example;

public enum PieceType {
    //♖♘♗♔♕♗♘♖
    //♙♙♙♙♙♙♙♙
    //
    //♟♟♟♟♟♟♟♟
    //♜♞♝♚♛♝♞♜
    PAWN("♙", "♟"),
    ROOK("♖", "♜"),
    BISHOP("♗","♝"),
    KNIGHT("♘","♞"),
    KING("♔","♚"),
    QUEEN("♕","♛"),
    EMPTY(" "," ");
    String white;
    String black;
    PieceType(String white, String black){
        this.white = white;
        this.black = black;
    }
}
