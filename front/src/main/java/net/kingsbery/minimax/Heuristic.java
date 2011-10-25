package net.kingsbery.minimax;

public interface Heuristic<T> {

    public int eval(T t);

    public int getMax();
}
