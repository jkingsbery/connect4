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
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(6,agent.getNextMove(new MoveRequest(board,situation.length(),1,null)));
    }
    
    @Test
    public void example3point1noWin(){
        String situation = "333434332220202240004044";
        assertFalse(Board.play(7,6,situation).move(1).isWin());
    }
    
    @Test
    public void example3point1blackWins(){
        String situation = "3334343322202022400040441";
        Board board = Board.play(7,6,situation);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(1,agent.getNextMove(new MoveRequest(board,situation.length(),1,null)));
    }
    
    @Test
    public void example3point1blackWinsAt5(){
        String situation = "3334343322202022400040445";
        Board board = Board.play(7,6,situation);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(5,agent.getNextMove(new MoveRequest(board,situation.length(),1,null)));
    }
    
    @Test
    public void example3point1whiteWinsBecauseBlackBlowsIt(){
        String situation = "33343433222020224000404461";
        Board board = Board.play(7,6,situation);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(1,agent.getNextMove(new MoveRequest(board,situation.length(),1,null)));
    }
    
    @Test
    public void example13point13(){
        String situation = "315";
        Board board = Board.play(7,6,situation);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertTrue(0!=agent.getNextMove(new MoveRequest(board,situation.length(),1,null)));
    }
    
//    @Test
    public void example13point13play5(){
        String situation = "3152";
        Board board = Board.play(7,6,situation);
        System.out.println(board);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(4,agent.getNextMove(new MoveRequest(board,situation.length(),1,null)));
    }
    
//    @Test
    public void example3point9(){
        String situation = "332";
        Board board = Board.play(7,6,situation);
        System.out.println(board);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(1,agent.getNextMove(new MoveRequest(board,situation.length(),2,null)));
    }
    
    @Test
    public void example3point11(){
        String situation = "332432240";
        Board board = Board.play(7,6,situation);
        System.out.println(board);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(1,agent.getNextMove(new MoveRequest(board,situation.length(),2,null)));
    }
    
    @Test
    public void example3point11step1(){
        String situation = "3324322401";
        Board board = Board.play(7,6,situation);
        System.out.println(board);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(1,agent.getNextMove(new MoveRequest(board,situation.length(),2,null)));
    }
    
    @Test
    public void example3point11step2(){
        String situation = "33243224011";
        Board board = Board.play(7,6,situation);
        System.out.println(board);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(3,agent.getNextMove(new MoveRequest(board,situation.length(),2,null)));
    }
    
    @Test
    public void example3point11step4(){
        String situation = "332432240113";
        Board board = Board.play(7,6,situation);
        System.out.println(board);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(1,agent.getNextMove(new MoveRequest(board,situation.length(),2,null)));
    }
    
    @Test
    public void example3point11alt(){
        String situation = "332432241";
        Board board = Board.play(7,6,situation);
        System.out.println(board);
        ConnectFourAgent agent = new MinMaxAgent(4);
        assertEquals(1,agent.getNextMove(new MoveRequest(board,situation.length(),2,null)));
    }

    
}
