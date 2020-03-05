package org.learn.solid.single_responsibility.good;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;


public class BoardPresenterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testBoardPresenterPrintsBoardToConsole() {
        Board board = new Board(3);
        BoardPresenter presenter = new BoardPresenter(board);
        System.setOut(new PrintStream(outContent));
        presenter.displayBoard();

        assertEquals("0|1|2\n3|4|5\n6|7|8\n", outContent.toString());
    }
}
