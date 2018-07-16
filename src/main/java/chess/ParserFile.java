package chess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParserFile {
    String[][] result = new String[8][8];
    List<String> resultList = new ArrayList<String>();

    public List<String> readTxtToArray(String filePath) {
        File file = new File(filePath);
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                resultList.add(input.nextLine());
            }
            input.close();
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
        test.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-01.txt");
        test.getResult();
        System.out.print("Yo");

    }
}
