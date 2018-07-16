package chess;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ChessBoardTest {
    @Test
    public void testChessBoardInit() {
        try {
            ParserFile getDummyBoard = new ParserFile();
            getDummyBoard.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-startup.txt");
            String[][] initBoardStatus = getDummyBoard.result;
            ChessBoard testObj = new ChessBoard();
            Assert.assertNotNull(testObj.currentBoard);
            Assert.assertEquals(testObj.currentBoard, initBoardStatus);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO
    @Test
    public void testReadFromFile() {
        try {
            ParserFile getDummyBoard = new ParserFile();
            getDummyBoard.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt");
            String[][] initBoardStatus = getDummyBoard.result;
            ChessBoard testObj = new ChessBoard();
            Assert.assertNotNull(testObj.currentBoard);
            Assert.assertEquals(testObj.currentBoard, initBoardStatus);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO
    @Test
    public void testWriteToBoard() {
        try {
            ParserFile getDummyBoard = new ParserFile();
            getDummyBoard.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-02.txt");
            String[][] initBoardStatus = getDummyBoard.result;
            ChessBoard testObj = new ChessBoard();
            Assert.assertNotNull(testObj.currentBoard);
            Assert.assertEquals(testObj.currentBoard, initBoardStatus);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
