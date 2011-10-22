package net.kingsbery.connect4.engine.impl;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.Move;
import net.kingsbery.connect4.engine.MoveRequest;

import org.springframework.stereotype.Component;

@Component
public class RandomAgent implements ConnectFourAgent {

    Random random = new Random();
    
    @Override
    public int getNextMove(MoveRequest request) {
        return request.getBoard().randomMove(random);
    }

}
