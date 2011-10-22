package net.kingsbery.connect4.engine.impl;

import java.util.List;
import java.util.Random;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;
import net.kingsbery.minimax.ChildGenerator;
import net.kingsbery.minimax.Heuristic;
import net.kingsbery.minimax.MinimaxAlgorithm;
import net.kingsbery.minimax.MinimaxAlgorithmImpl;
import net.kingsbery.minimax.Node;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class MinMaxAgent implements ConnectFourAgent {

    Random random = new Random();

    private static final Log log = LogFactory.getLog(MinMaxAgent.class);
    
    @Override
    public int getNextMove(MoveRequest request) {
        Node<Board> head = new Node<Board>(request.getBoard(), new ConnectFourChildGenerator());
        MinimaxAlgorithm<Board> algo = new MinimaxAlgorithmImpl<Board>(2, new ConnectFourHeuristic());
        int moveScore = algo.minimax(head);
        log.info("Move score: " + moveScore);
        return head.getChoice().getMove();
    }
    
    public static class ConnectFourChildGenerator implements ChildGenerator<Board>{

        

        @Override
        public List<Integer> getMoves(Board head) {
            return head.getLegalMoves();
        }

        @Override
        public Board getChild(Board underlying, int move) {
            return underlying.move(move);
        }

        @Override
        public boolean isChild(Board x) {
            return !x.stillPlaying();
        }

    }

    public static class ConnectFourHeuristic implements Heuristic<Board>{

        @Override
        public int eval(Board t) {
            if(t.isWin()){
                return 10000;
            }else{
                return 0;
            }
        }
        
    }    
}
