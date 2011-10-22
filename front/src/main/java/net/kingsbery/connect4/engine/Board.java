package net.kingsbery.connect4.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Board {

    public Board(int columns, int rows) {
        this(columns,rows,new int[columns][rows]);
    }
    
    protected Board(Board board) {
        this.columns = board.columns;
        this.rows = board.rows;
        this.board = new int[columns][rows];
        for (int i = 0; i < board.columns; i++) {
            for (int j = 0; j < board.rows; j++) {
                this.board[i][j] = board.board[i][j];
            }
        }
    }

    public Board(int columns, int rows, int[][] chips) {
        this.columns = columns;
        this.rows = rows;
        board = chips;
    }

    int rows;
    int columns;
    /**
     * Indexed as column,row. Rows are done so board[i][rows-1]==0 when there is
     * a legal move.
     */
    int board[][];

    public List<Integer> getLegalMoves() {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < this.columns; i++) {
            if (board[i][rows - 1] == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public Board move(int column, int player) {
        assert !this.isWin() : "Game is already over!";
        Board result = new Board(this);
        int openRow = 0;
        while (result.board[column][openRow] != 0)
            openRow++;
        result.board[column][openRow] = player;
        return result;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        for (int row = this.rows - 1; row >= 0; row--) {
            for (int col = 0; col < this.columns; col++) {
                result.append(this.board[col][row]);
            }
            result.append("\n");
        }
        return result.toString();
    }

    //TODO This could be cleaned up a bunch
    public boolean isWin() {
        int consecutive[][] = new int[this.columns][this.rows];
        for (int col = 0; col < this.columns; col++) {
            for (int row = 0; row < this.rows; row++) {
                consecutive[col][row] = samePlayers(col, row, col, row - 1) ? consecutive[col][row - 1] + 1
                        : 1;
                if (consecutive[col][row] == 4)
                    return true;
            }
        }
        for (int row = 0; row < this.rows; row++) {
            for (int col = 0; col < this.columns; col++) {
                consecutive[col][row] = samePlayers(col, row, col-1, row ) ? consecutive[col-1][row] + 1
                        : 1;
                if (consecutive[col][row] == 4)
                    return true;
            }
        }
        for (int row = 0; row < this.rows; row++) {
            for (int col = 0; col < this.columns; col++) {
                consecutive[col][row] = samePlayers(col, row, col-1, row-1 ) ? consecutive[col-1][row-1] + 1
                        : 1;
                if (consecutive[col][row] == 4)
                    return true;
            }
        }
        for (int row = 0; row < this.rows; row++) {
            for (int col = 0; col < this.columns; col++) {
                consecutive[col][row] = samePlayers(col, row, col+1, row-1 ) ? consecutive[col+1][row-1] + 1
                        : 1;
                if (consecutive[col][row] == 4)
                    return true;
            }
        }
        return false;
    }

    private boolean samePlayers(int col, int row, int col2, int row2) {
        return col<this.columns && col2<this.columns && row >= 0 && row2 >= 0 && col>=0 && col2>=0 && board[col][row] != 0
                && board[col2][row2] != 0
                && board[col][row] == board[col2][row2];
    }

    public boolean stillPlaying() {
        return !(isWin() || getLegalMoves().isEmpty());
    }

    public int getRows() {
        return this.rows;
    }
    
    public int getColumns(){
        return this.columns;
    }

    public int getHeight(int column) {
        for(int row=0; row<this.rows; row++){
            if(board[column][row]==0){
                return row;
            }
        }
        return this.rows;
    }

    public Map<Integer,Board> getNextBoards(int player) {
        this.getLegalMoves();
        Map<Integer,Board> result =new HashMap<Integer,Board>();
        for(Integer x :this.getLegalMoves()){
            result.put(x, this.move(x, player));
        }
        return result;
    }

    public int randomMove(Random random) {
        List<Integer> legalMoves = getLegalMoves();
        Collections.shuffle(legalMoves,random);
        return legalMoves.get(0);        
    }

    public int getCurrent() {
        int count=0;
        for(int col =0 ; col<this.columns; col++){
            for(int row=0; row<this.rows; row++){
                if(board[col][row]!=0) count++;
            }
        }
        return count%2==0 ? 2 : 1;
    }
    
    @Override
    public boolean equals(Object x){
        if(!(x instanceof Board)) return false;
        else{
            Board other = (Board) x;
            if(other.columns!=this.columns || other.rows!=this.rows){
                return false;
            }else{
                for(int col = 0; col < this.columns; col++){
                    for(int row =0 ; row < this.rows; row++){
                        if(this.board[col][row]!=other.board[col][row])return false;
                    }
                }
            }
        }
        return true;
    }
}
