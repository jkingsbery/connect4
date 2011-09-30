package net.kingsbery.connect4.engine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class BoardTest {

    @Test
    public void legalMoveWhenEmpty() {
        Board board = new Board(7, 6);
        assertFalse(board.getLegalMoves().isEmpty());
    }

    @Test
    public void seeMove() {
        int initColumns = 7;
        Board board = new Board(initColumns, 6).move(0, 1).move(0, 2)
                .move(0, 1).move(0, 2).move(0, 1).move(0, 2);
        assertEquals(initColumns - 1, board.getLegalMoves().size());
    }

    @Test
    public void noWinAtBeginning() {
        Board board = new Board(7, 6);
        assertFalse(board.isWin());
    }

    @Test
    public void verticalWin() {
        Board board = new Board(7, 6).move(0, 1).move(1, 2).move(0, 1)
                .move(1, 2).move(0, 1).move(1, 2).move(0, 1);
        System.out.println(board);
        assertTrue(board.isWin());
    }

    @Test
    public void horizontalWin() {
        Board board = new Board(7, 6).move(0, 1).move(0, 2).move(1, 1)
                .move(1, 2).move(2, 1).move(2, 2).move(3, 1);
        System.out.println(board);
        assertTrue(board.isWin());
    }

    @Test
    public void diagonalToTopRightWin() {
        Board board = new Board(7, 6).move(0, 1).move(1, 2).move(1, 1)
                .move(2, 2).move(2, 1).move(3, 2).move(2, 1).move(3, 2)
                .move(3, 1).move(6,2).move(3,1);
        System.out.println(board);
        assertTrue(board.isWin());
    }
    
    @Test
    public void diagonalToTopLeftWin() {
        Board board = new Board(7, 6).move(6, 1).move(5, 2).move(5, 1)
                .move(4, 2).move(4, 1).move(3, 2).move(4, 1).move(3, 2)
                .move(3, 1).move(1,2).move(3,1);
        System.out.println(board);
        assertTrue(board.isWin());
    }

}
