package net.kingsbery.minimax;

public class MinimaxAlgorithmImpl<T> implements MinimaxAlgorithm<T> {

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
            return heuristic.eval(head.getUnderlying());
        } else {
            if (depth % 2 == 0) {
                int alpha = Integer.MIN_VALUE;
                
                for (Object x : head.children) {
                    Node child = (Node)x;
                    int score = minimax(child, depth + 1);
                    if (score > alpha) {
                        head.setChoice(child);
                        alpha = score;
                    }
                }
                return alpha;
            } else if (depth % 2 == 1) {
                int alpha = Integer.MAX_VALUE;
                for (Object x : head.children) {
                    Node child = (Node)x;
                    int score = minimax(child, depth + 1);
                    if (score < alpha) {
                        head.setChoice(child);
                        alpha = score;
                    }
                }
                return alpha;
            }else{
                throw new AssertionError("depth must be even or odd but was " + depth);
            }
        }
    }


}
