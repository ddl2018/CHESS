package chess;

import java.io.IOException;

public class ChessBoard {
    String[][] currentBoard = new String[8][8];
    ParserFile reader;
    WriterFile writer;

    public ChessBoard() {
        reader = new ParserFile();
        reader.readTxtToArray("C:/Users/Ashle/Downloads/Tabit Exam - Chess/src/test/resources/chess-startup.txt");
        currentBoard = reader.getResult();
    }

    public String[][] readChessBoard(String fileWithPath) {
        reader = new ParserFile();
        reader.readTxtToArray(fileWithPath);
        currentBoard = reader.getResult();
        return currentBoard;
    }

    // write to file
    public void writeChessBoard(String filePath, String fileName) throws IOException {
        writer = new WriterFile();
        writer.write(filePath, fileName, currentBoard);
    }

    //validation piece numbers
    public void validator() throws Exception {
        boolean valid = true;
        int numberOfKing = 0;
        int numberOfQueen = 0;
        int numberOfRook = 0;
        int numberOfBishop = 0;
        int numberOfKnight = 0;
        int numberOfPawn = 0;
        String tmpPiece;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tmpPiece = currentBoard[i][j];
                switch (tmpPiece) {
                    case "nb":
                        numberOfQueen++;
                        break;
                    case "qu":
                        numberOfQueen++;
                        break;
                    case "ki":
                        numberOfKing++;
                        break;
                    case "ıʞ":
                        numberOfKing++;
                        break;
                    case "ro":
                        numberOfRook++;
                        break;
                    case "oɹ":
                        numberOfRook++;
                        break;
                    case "uʞ":
                        numberOfKnight++;
                        break;
                    case "kn":
                        numberOfKnight++;
                        break;
                    case "bi":
                        numberOfBishop++;
                        break;
                    case "ıq":
                        numberOfBishop++;
                        break;
                    case "pa":
                        numberOfPawn++;
                        break;
                    case "ɐd":
                        numberOfPawn++;
                        break;
                }
            }
        }
        if (numberOfQueen > 2 || numberOfKing > 2 || numberOfRook > 4 || numberOfBishop > 4 || numberOfKnight > 4 || numberOfPawn > 8) {
            throw new Exception("Number of pieces is not correct:" + "Queen, King, Rook, Bishop, Knight, Pawn: " + numberOfQueen + ", " + numberOfKing + ", " + numberOfRook + ", " + numberOfBishop + ", " + numberOfKnight + ", " + numberOfPawn);
        }
    }
}
