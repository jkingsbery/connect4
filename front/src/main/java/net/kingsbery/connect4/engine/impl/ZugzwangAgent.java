package net.kingsbery.connect4.engine.impl;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;

public class ZugzwangAgent implements ConnectFourAgent {

    private ConnectFourAgent base;

    public ZugzwangAgent(ConnectFourAgent base){
        this.base=base;
    }
    
    @Override
    public int getNextMove(MoveRequest request) {
        return 0;
        
    }

}
