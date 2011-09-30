package net.kingsbery.connect4.engine;

public interface ConnectFourAgent {

    public int getNextMove(Board board, int moveNumber, int playerToMove, Move lastMove);
}
