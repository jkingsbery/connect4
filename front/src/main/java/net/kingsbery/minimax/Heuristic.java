package net.kingsbery.minimax;

public interface Heuristic<T> {

    public int eval(T t);
}
