package net.kingsbery.connect4.engine.impl;

import java.util.Map;
import java.util.Random;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;
import net.kingsbery.minimax.Heuristic;
import net.kingsbery.minimax.MinimaxAlgorithm;
import net.kingsbery.minimax.MinimaxAlgorithmImpl;
import net.kingsbery.minimax.Node;

import org.springframework.stereotype.Component;

@Component
public class MinMaxAgent implements ConnectFourAgent {

    Random random = new Random();

    @Override
    public int getNextMove(MoveRequest request) {
        
        
        // TODO Auto-generated method stub
        return 0;
    }

}
