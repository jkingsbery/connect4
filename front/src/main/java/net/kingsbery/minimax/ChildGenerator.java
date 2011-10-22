package net.kingsbery.minimax;

import java.util.List;

public interface ChildGenerator<T> {

    List<T> getChildren(T head);

}
