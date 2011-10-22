package net.kingsbery.minimax;

import java.util.List;

public interface ChildGenerator<T> {

    List<T> getChildren(T head);

    List<Integer> getMoves(T head);
    
    T getChild(T underlying, int move);
}
