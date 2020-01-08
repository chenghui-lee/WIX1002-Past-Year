
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int board[][] = new int[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = r.nextInt(2);
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
        // Check for row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == board[row][1] && board[row][0] == board[row][2]) {
                System.out.println("All " + board[row][1] + "s on row " + row);
            }
        }
        // Check for col
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == board[1][col] && board[0][col] == board[2][col]) {
                System.out.println("All " + board[col][1] + "s on column " + col);
            }
        }
        // Check for diagonal
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] ||
                board[0][2] == board[1][1] && board[0][2] == board[2][0])
            System.out.println("All " + board[1][1] + "s on diagonal" );
    }

}
