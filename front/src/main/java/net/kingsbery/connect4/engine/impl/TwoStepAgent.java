package net.kingsbery.connect4.engine.impl;

import java.util.Map;
import java.util.Random;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;

public class TwoStepAgent implements ConnectFourAgent{
    Random random = new Random();

    @Override
    public int getNextMove(MoveRequest request) {
        Board board = request.getBoard();
        Map<Integer, Board> nextBoards = board.getNextBoards(request
                .getPlayerToMove());
        for (Integer x : nextBoards.keySet()) {
            if (nextBoards.get(x).isWin()) {
                return x;
            }
        }

        for (Integer x : nextBoards.keySet()) {
            Map<Integer, Board> nextBoards2 = nextBoards.get(x).getNextBoards(
                    getOtherPlayer(request.getPlayerToMove()));
            for (Integer y : nextBoards2.keySet()) {
                if (nextBoards2.get(y).isWin()) {
                    return y;
                }
            }
        }

        return board.randomMove(random);
    }

    private int getOtherPlayer(int playerToMove) {
        return playerToMove == 1 ? 2 : 1;
    }

}
