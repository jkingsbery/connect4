package net.kingsbery;

import java.util.ArrayList;
import java.util.List;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.impl.RandomAgent;

public class GameSimulator {

    public static void main(String args[]){
        ConnectFourAgent player[] = new ConnectFourAgent[2];
        player[0]=new RandomAgent();
        player[1]=new RandomAgent();
        Board board = new Board(7,6);
        
        int moveNumber=0;
        List<Integer> moves = new ArrayList<Integer>();
        while(board.stillPlaying()){
            int currentPlayer=moveNumber%2;
            int turnNumber=moveNumber/2;
            int move = player[currentPlayer].getNextMove(board, moveNumber, currentPlayer+1, null);
            moves.add(move);
            board = board.move(move, currentPlayer+1);
            moveNumber++;
        }
        System.out.println(board);
        System.out.println(moves);
        if(board.isWin()){            
            System.out.println("Player #" + (1-(moveNumber%2)+1) + " won!");
        }else{
            System.out.println("Tie...");
        }
    }
}
