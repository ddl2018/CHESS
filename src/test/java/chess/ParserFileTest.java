package chess;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

class ParserFileTest {
    @Test
    public void testParserException() {
        ParserFile testObj = new ParserFile();
        try {
            testObj.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/01.txt");
        } catch (IOException e) {
            Assert.assertEquals(e, new IOException());
            e.printStackTrace();
        }

        testObj.getResult();
    }

   //TODO
   @Test
    public void testParserRead() {
        ParserFile testObj = new ParserFile();
        try {
            Assert.assertNull(testObj.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        testObj.getResult();
    }
    //TODO
    @Test
    public void testParserGenerateResult() {
        ParserFile testObj = new ParserFile();
        try {
            testObj.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        testObj.getResult();
    }
    //TODO
    @Test
    public void testParser() {
        ParserFile testObj = new ParserFile();
        try {
            testObj.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        testObj.getResult();
    }
}