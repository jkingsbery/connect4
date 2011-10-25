package net.kingsbery.minimax;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MinimaxAlgorithmImpl<T> implements MinimaxAlgorithm<T> {

    private static final Log log = LogFactory.getLog(MinimaxAlgorithmImpl.class);
    
    private int maxDepth;
    private Heuristic<T> heuristic;

    public MinimaxAlgorithmImpl(int depth, Heuristic<T> heuristic) {
        this.maxDepth = depth;
        this.heuristic=heuristic;
    }

    @Override
    public int minimax(Node<T> head) {
        return minimax(head, 0);
    }

    protected int minimax(Node<T> head, int depth) {
        head.generateChildren();
        if (head.isLeaf() || depth >= maxDepth) {
            int baseScore = heuristic.eval(head.getUnderlying());
            if(depth%2==0){
                baseScore*=-1;
            }
            return baseScore;
        } else {
            //TODO reduce duplication here
            if (depth % 2 == 0) {
                int alpha = Integer.MIN_VALUE;
                
                for (Object x : head.children) {
                    if(alpha==heuristic.getMax()){
                        break;
                    }
                    Node child = (Node)x;
                    int score = minimax(child, depth + 1);
                    child.setValue(score);
                    log.debug(tabs(depth) + "Score for move " + child.getMove() + ": " + score);
                    if (score > alpha) {
                        head.setChoice(child);
                        alpha = score;
                    }
                }
                assert head.getChoice()!=null;
                return alpha;
            } else if (depth % 2 == 1) {
                int alpha = Integer.MAX_VALUE;
                for (Object x : head.children) {
                    if(alpha==-1*heuristic.getMax()){
                        break;
                    }
                    Node child = (Node)x;
                    int score =minimax(child, depth + 1);
                    child.setValue(score);
                    log.debug(tabs(depth) + "Score for move " + child.getMove() + ": " + score);
                    if (score < alpha) {
                        head.setChoice(child);
                        alpha = score;
                    }
                }
                assert head.getChoice()!=null;
                return alpha;
            }else{
                throw new AssertionError("depth must be even or odd but was " + depth);
            }
        }
    }

    private String tabs(int depth) {
        String result = "";
        for(int i=0; i<depth; i++){
            result+="\t";
        }
        return result;
    }


}
