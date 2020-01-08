
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int j = row; j < n; j++) {
                System.out.print(" "); // num of space decrement by row
            }
            for (int k = 1; k < (row * 2); k++) { // Print num (quantity = row*2 -1)
                int temp = row-k+1;
                if (temp<1) // If result is zero
                    temp = Math.abs(temp) +2; // make it +ve and add 2 to each result
                System.out.print(Math.abs(temp));
            }
            System.out.println();
        }
    }

}
