package net.kingsbery.minimax;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MiniMaxTest {


    public static class TestHeuristic implements Heuristic<String>{
        
        @Override
        public int eval(String underlying) {
            if("A".equals(underlying)){
                return 10;
            }else if("B".equals(underlying)){
                return -10;
            }else if("C".equals(underlying)){
                return 5;
            }else if("D".equals(underlying)){
                return -7;
            }else{
                throw new AssertionError("This heuristic cannot evaluate " + underlying);
            }
        }
        
    }
    
    @Before
    public void setup(){
         
    }
    
    @Test
    public void twoChildNodesShouldPickBetter(){
        MinimaxAlgorithm<String> algo = new MinimaxAlgorithmImpl<String>(1,new TestHeuristic());
        Node<String> head = new Node<String>("Z");
        head.addLeaf("B");
        head.addLeaf("D");
        
        assertEquals(-7,algo.minimax(head));
    }
    
    @Test
    public void chooseCorrectPath(){
        MinimaxAlgorithm<String> algo = new MinimaxAlgorithmImpl<String>(1,new TestHeuristic());
        Node<String> head = new Node<String>("Z");
        head.addLeaf("B");
        Node<String> right = head.addLeaf("D");
        algo.minimax(head);
        assertEquals(right,head.getChoice());
    }
    
    @Test
    public void twoLevelsShouldPickBetter(){
        MinimaxAlgorithm<String> algo = new MinimaxAlgorithmImpl<String>(2,new TestHeuristic());
        Node<String> left = new Node<String>("X");
        left.addLeaf("A");
        left.addLeaf("B");
        Node<String> right = new Node<String>("Y");
        right.addLeaf("C");
        right.addLeaf("D");

        Node<String> head = new Node<String>("Z");
        head.addNode(left);
        head.addNode(right);
        
        assertEquals(-7,algo.minimax(head));
    }
}
