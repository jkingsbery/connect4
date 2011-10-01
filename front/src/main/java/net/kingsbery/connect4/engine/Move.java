package net.kingsbery.connect4.engine;

public class Move {

    int row;
    int column;
    int player;
    int moves;

    public Move(int row, int col, int player, int moves) {
        this.row = row;
        this.column = col;
        this.player = player;
        this.moves = moves;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getPlayer() {
        return player;
    }

    public int getMoves() {
        return moves;
    }

}
