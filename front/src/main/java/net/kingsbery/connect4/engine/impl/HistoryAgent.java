package net.kingsbery.connect4.engine.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;
import net.kingsbery.minimax.Heuristic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HistoryAgent implements ConnectFourAgent{

    private static final Log log = LogFactory.getLog(HistoryAgent.class);
    
    final List<Integer> moves = new ArrayList<Integer>();
    ConnectFourAgent base = new MinMaxAgent(4,new Heuristic<Board>(){

        public String getPrefix(){
            String prefix="";
            for(int x:moves){
                prefix+=x;
            }
            return prefix;
        }
        
        @Override
        public int eval(Board t) {
            Random random = new Random(42);
            String prefix=getPrefix();
            if(t.isWin()){
                return 10000;
            }else{
                //TODO: only do this for the first 4 moves or so (depending on how many games have been trained on).
                try {
                    int wins=0;
                    int losses=0;
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("games2.txt")));
                    String line;
                    while((line=reader.readLine())!=null){
                        //TODO: get correct player
                        if(line.startsWith("1:"+prefix)) wins++;
                        if(line.startsWith("2:"+prefix)) losses++;
                    }
                    return 5000*wins/(wins+losses);
                } catch (IOException e) {
                    return random.nextInt();
                }
            }
        }});
    @Override
    public int getNextMove(MoveRequest request) {
        if(request.getBoard().size()<=1 && !moves.isEmpty()){
            //new game, we lost the last one
            log.info("LOST: " + moves);
            moves.clear();
        }
        if(request.getLastMove()!=null){
            moves.add(request.getLastMove().getColumn());
        }
        
        int result = base.getNextMove(request);
        moves.add(result);
        if(request.getBoard().move(result).isWin()){
            //dump history, we won this one
            log.info("WIN: " + moves);
            moves.clear();
        }
        return result;
    }

}
