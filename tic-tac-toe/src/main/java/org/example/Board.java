package org.example;

public class Board {
    private int size;
    private Sign[][] board;

    public Board(int size){
        this.size = size;
        this.board = new Sign[size][size];
    }

    public boolean setBoard(int row, int col, Players p){
        if(board[row][col] == null){
            board[row][col] = p.sign;
            return true;
        }
        return false;
    }

    public Sign[][] getBoard() {
        return this.board;
    }

    public String display(){
        StringBuilder sb = new StringBuilder("");
        String temp = "";
        for(Sign[] row: this.board){
            temp = "[";
            for(Sign sign: row){
                temp += (sign == null ? "   ," : " "+sign.name()+" ,");
            }
            temp += "\b]\n";
            sb.append(temp);
            temp = "";
        }
        return sb.toString();
    }
}
