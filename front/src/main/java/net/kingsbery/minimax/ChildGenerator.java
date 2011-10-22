package net.kingsbery.minimax;

import java.util.List;

/**
 * Child generator gives a more abstract way to reason about Minimax problems.
 * @author jamie
 *
 * @param <T>
 */
public interface ChildGenerator<T> {

    boolean isChild(T x);
    
    List<Integer> getMoves(T head);
    
    T getChild(T underlying, int move);
}
