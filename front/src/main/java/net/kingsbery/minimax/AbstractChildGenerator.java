package net.kingsbery.minimax;

public abstract class AbstractChildGenerator<T> implements ChildGenerator<T> {

    @Override
    public T getChild(T underlying, int move) {
        return this.getChildren(underlying).get(move);
    }
}
