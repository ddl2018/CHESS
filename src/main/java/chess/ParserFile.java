package chess;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class ParserFile {
    String[][] result = new String[8][8];
    List<String> resultList = new ArrayList<String>();

    public List<String> readTxtToArray(String filePath) throws IOException {
        FileInputStream fstream = new FileInputStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String line;
        try {

            while ((line = br.readLine()) != null) {
                resultList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        resultList.remove(resultList.size() - 1);
        return resultList;
    }

    public String[][] getResult() {
        convertListTo2DArray();
        return result;
    }

    private void convertListTo2DArray() {
        int i = -1;
        for (String s : resultList) {
            String tmp[] = s.split("|");
            i++;
            for (int j = 1, k = 0; j < tmp.length; j++, k++) {
                result[i][k] = tmp[j];
            }
        }
    }

    public static void main(String arg[]) {
        ParserFile test = new ParserFile();
        try {
            test.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        test.getResult();
        System.out.print("Yo");

    }
}
