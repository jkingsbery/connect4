package net.kingsbery.connect4.engine.impl;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;

import org.springframework.stereotype.Component;

@Component
public class DynamicDepthMinMaxAgent implements ConnectFourAgent{

    ConnectFourAgent early = new MinMaxAgent(4);
    ConnectFourAgent late = new MinMaxAgent(20);
    
    @Override
    public int getNextMove(MoveRequest request) {
        Board board = request.getBoard();
        if(board.getLegalMoves().size()<4){
            return late.getNextMove(request);
        }else{
            return early.getNextMove(request);
        }
    }

    
}
