package net.kingsbery.connect4.engine.impl;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.Move;

public class RandomAgent implements ConnectFourAgent {

    Random random = new Random();
    
    @Override
    public int getNextMove(Board board, int moveNumber, int playerToMove,
            Move lastMove) {
        List<Integer> legalMoves = board.getLegalMoves();
        Collections.shuffle(legalMoves,random);
        return legalMoves.get(0);
    }

}
