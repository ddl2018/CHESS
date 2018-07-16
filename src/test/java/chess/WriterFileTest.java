package chess;

import org.junit.Test;

import java.io.IOException;

public class WriterFileTest {
    //TODO
    @Test
    public void testWriterException() {
        WriterFile testObj = new WriterFile();
        String[][] dummyBoard = new String[8][8];
        try {
            testObj.write("", "", dummyBoard);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO
    @Test
    public void testWriterWrite() {
        WriterFile testObj = new WriterFile();
        ParserFile parser = new ParserFile();
        try {
            parser.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt");
            String[][] dummyBoard = parser.result;
            testObj.write("", "", dummyBoard);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO
    @Test
    public void testWriter() {
        WriterFile testObj = new WriterFile();
        ParserFile parser = new ParserFile();
        try {
            parser.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt");
            String[][] dummyBoard = parser.result;
            testObj.write("", "", dummyBoard);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
