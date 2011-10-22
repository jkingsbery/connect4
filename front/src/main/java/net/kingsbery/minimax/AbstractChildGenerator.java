package net.kingsbery.minimax;

import java.util.List;

public abstract class AbstractChildGenerator<T> implements ChildGenerator<T> {

    protected abstract List<T> getChildren(T head);
    
    @Override
    public T getChild(T underlying, int move) {
        return this.getChildren(underlying).get(move);
    }
}
