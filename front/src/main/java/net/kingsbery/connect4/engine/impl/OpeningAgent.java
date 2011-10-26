package net.kingsbery.connect4.engine.impl;

import java.util.ArrayList;
import java.util.List;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;

public class OpeningAgent implements ConnectFourAgent {

    ConnectFourAgent base;

    final List<Integer> moves = new ArrayList<Integer>();
    public OpeningAgent(ConnectFourAgent base) {
        this.base = base;
    }

    public String getPrefix(){
        String prefix="";
        for(int x:moves){
            prefix+=x;
        }
        return prefix;
    }
    

    @Override
    public int getNextMove(MoveRequest request) {
        recordMove(request);
        Board board = request.getBoard();
        //White Moves
        if (board.size()==0 && board.getHeight(3) == 0 ) {
            return 3;
        }else if(getPrefix().equals("3321") ){
            return 4;
        }else if(getPrefix().equals("3324")){
            return 1;
        }
        else if(getPrefix().equals("3340")){
            return 2;
        }
        //Black Moves
        //Past Opening
        return base.getNextMove(request);
    }
    
    protected void recordMove(MoveRequest request) {
        if(request.getBoard().size()<=1 && !moves.isEmpty()){
            //new game, we lost the last one
            moves.clear();
        }
        if(request.getLastMove()!=null){
            moves.add(request.getLastMove().getColumn());
        }
    }

}
