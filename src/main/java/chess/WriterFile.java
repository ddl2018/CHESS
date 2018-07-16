package chess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {

    public void write(String filePath, String fileName, String[][] board) throws IOException {
        File file = new File("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/results.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 8; i >= 0; i--) {
                String line = i + " " + "|";
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 8; k++) {
                        line = line + board[j][k] + "|";
                    }
                }
                writer.write(line);
                writer.newLine();
            }
            writer.write("   a  b  c  d  e  f  g  h");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
