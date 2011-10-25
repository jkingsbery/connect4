package net.kingsbery;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.Move;
import net.kingsbery.connect4.engine.MoveRequest;
import net.kingsbery.connect4.engine.impl.HistoryAgent;
import net.kingsbery.connect4.engine.impl.MinMaxAgent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GameSimulator {

    private static BufferedWriter results;
    
    private static final Log log = LogFactory.getLog(GameSimulator.class);
    
    public static void main(String args[]) throws IOException {
        results = new BufferedWriter(new FileWriter("games.txt",true));
        long start = System.currentTimeMillis();
        ConnectFourAgent player[] = new ConnectFourAgent[2];
        player[0] = new MinMaxAgent(4);
        player[1] = new HistoryAgent();
        int results[] = new int[3];
        int games=20;
        for (int i = 0; i < games; i++) {
            int game = game(goFirst(player,i));
            results[inverse(game,i)]++;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ": " + results[i]);
        }
        System.out.println("Played " + games + " in " + (System.currentTimeMillis()- start) + " ms");
    }

    private static int inverse(int game, int i) {
        if(game==0){
            return game;
        }else if(i%2==0){
            return game;
        }else{
            return game==1?2:1;
        }
    }

    private static ConnectFourAgent[] goFirst(ConnectFourAgent[] player, int i) {
        if(i%2==0){
            return player;
        }else{
            ConnectFourAgent otherPlayer[]=new ConnectFourAgent[2];
            otherPlayer[0]=player[1];
            otherPlayer[1]=player[0];
            return otherPlayer;
        }
    }

    private static int game(ConnectFourAgent[] player) throws IOException {
        Board board = new Board(7, 6);

        int moveNumber = 0;
        List<Integer> moves = new ArrayList<Integer>();
        Move lastMove=null;
        while (board.stillPlaying()) {
            int currentPlayer = moveNumber % 2;
            int turnNumber = moveNumber / 2;
            int move = player[currentPlayer].getNextMove(new MoveRequest(board,
                    turnNumber, currentPlayer + 1, lastMove));
            lastMove=new Move(board.move(move).getHeight(move),move, (moveNumber+1)%2, moveNumber/2);
            moves.add(move);
            
            board = board.move(move, currentPlayer + 1);
            moveNumber++;
        }
        if (board.isWin()) {
            int winner = 1 - (moveNumber % 2) + 1;
            results.write(winner + ": " + moves + "\n");
            results.flush();
            return winner;
        } else {
            log.info(0 + ": " + moves);
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
