package net.kingsbery.minimax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node<T> {

    private int value;

    List<Node<T>> children = new ArrayList<Node<T>>();

    private Node<T> choice;

    private T underlying;

    private ChildGenerator<T> childGenerator;

    int move;
    
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

    public Node(T underlying, ChildGenerator<T> childGenerator) {
        this.setUnderlying(underlying);
        this.childGenerator=childGenerator;
    }

    public Node(T underlying, int move, ChildGenerator<T> childGenerator) {
        this(underlying,childGenerator);
        this.move=move;
    }

    public Node<T> addLeaf(T t) {
        Node<T> node= new Node<T>(t);
        children.add(node);
        return node;
    }

    public boolean isLeaf() {
        return childGenerator==null ? children.isEmpty() : childGenerator.isChild(underlying);
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

    public void generateChildren() {
        
        if(this.childGenerator!=null && !this.childGenerator.isChild(this.underlying) && children.isEmpty()){
            List<Integer> moves = this.childGenerator.getMoves(this.underlying);
            for(int move : moves){
                this.children.add( new Node<T>(childGenerator.getChild(this.underlying,move),move,childGenerator));
            }
        }
    }

    public int getMove() {
        return move;
    }
}
