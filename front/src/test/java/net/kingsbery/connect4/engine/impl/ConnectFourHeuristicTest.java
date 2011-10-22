package net.kingsbery.connect4.engine.impl;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.impl.MinMaxAgent.ConnectFourChildGenerator;
import net.kingsbery.connect4.engine.impl.MinMaxAgent.ConnectFourHeuristic;
import net.kingsbery.minimax.MinimaxAlgorithm;
import net.kingsbery.minimax.MinimaxAlgorithmImpl;
import net.kingsbery.minimax.Node;

import org.junit.Test;

public class ConnectFourHeuristicTest {

    @Test
    public void shouldBlock(){
        Board board = new Board(7,6);
        board = board.move(0, 1).move(0, 2).move(1,1).move(1,2).move(2,1).move(2,2).move(3,1);
        
        System.out.println(new MinMaxAgent.ConnectFourHeuristic().eval(board));
        assertTrue(0<new MinMaxAgent.ConnectFourHeuristic().eval(board));
    }
    
    @Test
    public void evaluate(){
        Board board = new Board(7,6);
        board = board.move(0, 1).move(0, 2).move(1,1).move(1,2).move(2,1).move(2,2);
        MinimaxAlgorithm<Board> algo = new MinimaxAlgorithmImpl<Board>(2, new ConnectFourHeuristic());
        Node<Board> head = new Node<Board>(board, new ConnectFourChildGenerator());
        algo.minimax(head);
        assertNotNull(head.getChoice());
        System.out.println(head.getChoice().getMove());
        System.out.println(algo.minimax(head));
    }
    
}
