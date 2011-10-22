package net.kingsbery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;
import net.kingsbery.connect4.engine.impl.MinMaxAgent;
import net.kingsbery.connect4.engine.impl.RandomAgent;

public class GameSimulator {

    public static void main(String args[]) {
        ConnectFourAgent player[] = new ConnectFourAgent[2];
        player[0] = new RandomAgent();
        player[1] = new MinMaxAgent();
        int results[] = new int[3];
        for (int i = 0; i < 1000; i++) {
//            System.out.println("Game #: " +i);
            int game = game(player);
            results[game]++;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ": " + results[i]);
        }
    }

    private static int game(ConnectFourAgent[] player) {
        Board board = new Board(7, 6);

        int moveNumber = 0;
        List<Integer> moves = new ArrayList<Integer>();
        while (board.stillPlaying()) {
            int currentPlayer = moveNumber % 2;
            int turnNumber = moveNumber / 2;
            int move = player[currentPlayer].getNextMove(new MoveRequest(board,
                    turnNumber, currentPlayer + 1, null));
            moves.add(move);
            board = board.move(move, currentPlayer + 1);
            moveNumber++;
//            System.out.println(board);
//            pause();
        }
        if (board.isWin()) {
            return 1 - (moveNumber % 2) + 1;
        } else {
            return 0;
        }
    }

    private static void pause() {
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
