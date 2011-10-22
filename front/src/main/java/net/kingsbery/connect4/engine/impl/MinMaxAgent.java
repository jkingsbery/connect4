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
//        MinimaxAlgorithm algo = new MinimaxAlgorithmImpl(2,new Heuristic<String>(){
//
//            @Override
//            public int eval(String underlying) {
//                // TODO Auto-generated method stub
//                return 0;
//            }});
//        Board board = request.getBoard();
//        Node head = createHead(board,0,request.getPlayerToMove(),2);
//        algo.minimax(head);
//        return head.getChoice().getUnderlying();
        return 0;
    }

    private Node createHead(Board board, int choice, int player, int depth) {
//        Node result = new Node();
//        result.setChoice(choice);
//        result.setUnderlying(board);
//        if(depth==0 || !board.stillPlaying()){
//            result.setValue(heuristic(board,player));
//        }else{
//            Map<Integer, Board> nextBoards = board.getNextBoards(player);
//            for(Integer x : nextBoards.keySet()){
//                Board child = nextBoards.get(x);
//                Node childNode = createHead(child,x,other(player),depth-1);
//                result.addNode(childNode);
//            }
//        }
//        return result;
        return new Node();
    }

    private int heuristic(Board board, int original) {
        int result;
        if(board.isWin()){
            result=10000;
        }else{
            result=random.nextInt(25);
        }
        
        return board.getCurrent()==original ? result : (-result);
    }

    private int other(int player){
        return player==1 ? 2 : 1;
    }
    
}
