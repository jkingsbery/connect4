package net.kingsbery.minimax;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.kingsbery.minimax.MiniMaxTest.TestHeuristic;

import org.junit.Test;

public class ChildGenerationTest {

    
    @Test
    public void foo(){
        MinimaxAlgorithm<String> algo = new MinimaxAlgorithmImpl<String>(2,new TestHeuristic());
        Node<String> head = new Node<String>("Z",new ChildGenerator<String>(){
            @Override
            public List<String> getChildren(String head){
                if("ABCD".contains(head)){
                    return Collections.emptyList();
                }else if("X".equals(head)){
                    return Arrays.asList("A","B");
                }else if("Y".equals(head)){
                    return Arrays.asList("C","D");
                }else if("Z".equals(head)){
                    return Arrays.asList("X","Y");
                }
                else{
                    throw new RuntimeException("Cannot evaluate game state " + head);
                }
            }
        });
        algo.minimax(head);
        assertEquals(-7,algo.minimax(head));
    }
}
