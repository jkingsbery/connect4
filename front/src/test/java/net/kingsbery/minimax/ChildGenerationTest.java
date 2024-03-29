package net.kingsbery.minimax;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.kingsbery.minimax.MiniMaxTest.TestHeuristic;

import org.junit.Test;

public class ChildGenerationTest {

    public static class TestChildGenerator extends AbstractChildGenerator<String> {

        protected List<String> getChildren(String head) {
            if ("ABCD".contains(head)) {
                return Collections.emptyList();
            } else if ("X".equals(head)) {
                return Arrays.asList("A", "B");
            } else if ("Y".equals(head)) {
                return Arrays.asList("C", "D");
            } else if ("Z".equals(head)) {
                return Arrays.asList("X", "Y");
            } else {
                throw new RuntimeException("Cannot evaluate game state " + head);
            }
        }

        @Override
        public List<Integer> getMoves(String head) {
            if (isChild(head)) {
                return Collections.emptyList();
            } else if ("XYZ".contains(head)) {
                return Arrays.asList(0,1);
            } else {
                throw new RuntimeException("Cannot evaluate game state " + head);
            }
        }

        @Override
        public boolean isChild(String x) {
            return "ABCD".contains(x);
        }
    }

    public static class TestSwitchChildGenerator extends
            AbstractChildGenerator<String> {
        @Override
        public List<String> getChildren(String head) {
            if ("ABCD".contains(head)) {
                return Collections.emptyList();
            } else if ("X".equals(head)) {
                return Arrays.asList("A", "B");
            } else if ("Y".equals(head)) {
                return Arrays.asList("C", "D");
            } else if ("Z".equals(head)) {
                return Arrays.asList("Y", "X");
            } else {
                throw new RuntimeException("Cannot evaluate game state " + head);
            }
        }

        @Override
        public List<Integer> getMoves(String head) {
            if ("ABCD".contains(head)) {
                return Collections.emptyList();
            } else if ("XYZ".contains(head)) {
                return Arrays.asList(0,1);
            } else {
                throw new RuntimeException("Cannot evaluate game state " + head);
            }
        }
        
        @Override
        public boolean isChild(String x) {
            return "ABCD".contains(x);
        }
        
    }

    @Test
    public void rightMove() {
        MinimaxAlgorithm<String> algo = new MinimaxAlgorithmImpl<String>(2,
                new TestHeuristic());
        Node<String> head = new Node<String>("Z",
                new TestChildGenerator());
        algo.minimax(head);
        assertEquals(1, head.getChoice().getMove());
    }
    
    @Test
    public void rightMoveWhenXYSwitched() {
        MinimaxAlgorithm<String> algo = new MinimaxAlgorithmImpl<String>(2,
                new TestHeuristic());
        Node<String> head = new Node<String>("Z",
                new TestSwitchChildGenerator());
        algo.minimax(head);
        assertEquals(0, head.getChoice().getMove());
    }
}
