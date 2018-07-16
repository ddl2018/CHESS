package chess;

import org.junit.Test;

class ParserFileTest {
    @Test
    public void testParser() {
        ParserFile testObj = new ParserFile();
        testObj.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt");

        testObj.getResult();
    }
}