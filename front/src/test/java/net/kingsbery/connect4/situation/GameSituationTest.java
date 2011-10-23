package net.kingsbery.connect4.situation;

import static org.junit.Assert.*;
import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;
import net.kingsbery.connect4.engine.impl.MinMaxAgent;

import org.junit.Test;

public class GameSituationTest {

    @Test
    public void example3point1(){
        String situation = "333434332220202240004044";
        Board board = Board.play(7,6,situation);
        System.out.println(board);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(6,agent.getNextMove(new MoveRequest(board,situation.length(),1,null)));
    }
    
}
