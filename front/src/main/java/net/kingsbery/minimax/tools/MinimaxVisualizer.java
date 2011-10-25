package net.kingsbery.minimax.tools;

import java.io.File;
import java.io.PrintStream;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.impl.MinMaxAgent;
import net.kingsbery.connect4.engine.impl.MinMaxAgent.ConnectFourChildGenerator;
import net.kingsbery.minimax.MinimaxAlgorithm;
import net.kingsbery.minimax.MinimaxAlgorithmImpl;
import net.kingsbery.minimax.Node;

public class MinimaxVisualizer {

    private static PrintStream out ;
    public static void main(String args[]) throws Exception {
        out= new PrintStream(new File("viz/example3.1.dot"));
        String situation = "333434332220202240004044";
        Board board = Board.play(7, 6, situation);
        Node<Board> head = new Node<Board>(board,
                new ConnectFourChildGenerator());
        MinimaxAlgorithm<Board> algo = new MinimaxAlgorithmImpl<Board>(4,
                new MinMaxAgent.DefaultConnectFourHeuristic());
        algo.minimax(head);

        out.println("digraph G {");
        drawEdges(head);
        out.println("}");
    }

    private static void drawEdges(Node<Board> head) {
        if (!head.isLeaf()) {
            for (Node<Board> child : head.getChildren()) {
                out.println("\t"
                        + "\""+head.toString().substring(
                                "net.kingsbery.minimax.Node@".length())+"\""
                        + "->"
                        + "\""+child.toString().substring(
                                "net.kingsbery.minimax.Node@".length())+"\""
                        + "[label=\"" + child.getMove() + ":"
                        + child.getValue() + "\"];");
                drawEdges(child);
            }
        }
    }

}
