package net.kingsbery.connect4.engine.impl;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.minimax.Heuristic;

public class LearningHeuristic implements Heuristic<Board> {

    Heuristic<Board> base = new MinMaxAgent.DefaultConnectFourHeuristic();
    
    @Override
    public int eval(Board t) {
        return base.eval(t);
    }

    @Override
    public int getMax() {
        return base.getMax();
    }

}
