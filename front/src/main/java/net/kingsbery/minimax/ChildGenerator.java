package net.kingsbery.minimax;

import java.util.List;

/**
 * Child generator gives a more abstract way to reason about Minimax problems.
 * @author jamie
 *
 * @param <T>
 */
public interface ChildGenerator<T> {

    List<T> getChildren(T head);

    List<Integer> getMoves(T head);
    
    T getChild(T underlying, int move);
}
