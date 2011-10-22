package net.kingsbery.connect4.engine.impl;

import static org.junit.Assert.assertEquals;
import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.Move;
import net.kingsbery.connect4.engine.MoveRequest;

import org.junit.Test;

public class MinMaxAgentTest {

    @Test
    public void shouldBlock(){
        Board board = new Board(7,6);
        board = board.move(0, 1).move(0, 2).move(1,1).move(1,2).move(2,1);
        
        MoveRequest request = new MoveRequest(board,3,2,new Move(0,3,1,3));
        System.out.println(board);
        assertEquals(3,new MinMaxAgent().getNextMove(request));
    }
    
    @Test
    public void shouldWin(){
        Board board = new Board(7,6);
        board = board.move(0, 1).move(0, 2).move(1,1).move(1,2).move(2,1).move(2, 2);
        
        MoveRequest request = new MoveRequest(board,3,1,new Move(0,3,1,3));
        System.out.println(board);
        assertEquals(3,new MinMaxAgent().getNextMove(request));
    }
}
