package net.kingsbery.minimax;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.impl.MinMaxAgent.ConnectFourChildGenerator;
import net.kingsbery.connect4.engine.impl.MinMaxAgent.DefaultConnectFourHeuristic;

import org.junit.Test;

public class ConnectFourMiniMaxTest {

    @Test
    public void movesToWin(){
        String situation = "3334343322202022400040446";
        Board board = Board.play(7,6,situation);
        Node<Board> head = new Node<Board>(board, new ConnectFourChildGenerator());
        MinimaxAlgorithm<Board> algo = new MinimaxAlgorithmImpl<Board>(2, new DefaultConnectFourHeuristic());
        algo.minimax(head);
        System.out.println(head.getChoice().getMove());
    }
}
