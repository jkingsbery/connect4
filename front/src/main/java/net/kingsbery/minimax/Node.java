package net.kingsbery.minimax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node<T> {

    private int value;

    List<Node<T>> children = new ArrayList<Node<T>>();

    private Node<T> choice;

    private T underlying;

    @Deprecated
    public Node(){
        
    }
    
    @Deprecated
    public Node(int i) {
        this.setValue(i);
    }

    public Node(T underlying) {
        this.setUnderlying(underlying);
    }

    public Node<T> addLeaf(T t) {
        Node<T> node= new Node<T>(t);
        children.add(node);
        return node;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    public List<Node<T>> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        this.value=i;
    }

    public void addNode(Node<T> node) {
        children.add(node);
    }
    
    public Node<T> getChoice(){
        return this.choice;
    }
    
    public void setChoice(Node<T> node){
        this.choice=node;
    }
    
    public void setUnderlying(T underlying){
        this.underlying=underlying;
    }
    
    public T getUnderlying(){
        return this.underlying;
    }
}
