package net.kingsbery.connect4.engine;

public class MoveRequest {

    private Board board;
    private int moveNumber;
    private int playerToMove;
    private Move lastMove;

    public MoveRequest(Board board, int moveNumber, int player, Move lastMove) {
        this.board = board;
        this.moveNumber = moveNumber;
        this.playerToMove = player;
        this.lastMove = lastMove;
    }

    void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setMoveNumber(int moveNumber) {
        this.moveNumber = moveNumber;
    }

    public int getMoveNumber() {
        return moveNumber;
    }

    public void setPlayerToMove(int playerToMove) {
        this.playerToMove = playerToMove;
    }

    public int getPlayerToMove() {
        return playerToMove;
    }

    public void setLastMove(Move lastMove) {
        this.lastMove = lastMove;
    }

    public Move getLastMove() {
        return lastMove;
    }

}
