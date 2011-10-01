package net.kingsbery.connect4.engine;

public class MoveResponse {

    
    
    private int move;

    public MoveResponse(int column) {
        this.move=column;
    }
    
    public int getMove(){
        return move;
    }

}
