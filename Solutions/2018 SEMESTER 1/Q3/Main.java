
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fontSize, fontFormat;
        char fontType;

        System.out.print("Enter font size: ");
        fontSize = s.nextInt();
        s.nextLine();
        System.out.print("Enter font type: ");
        fontType = s.nextLine().charAt(0);
        System.out.print("Enter format [1 - Vertical, 2- Horizontal]: ");
        fontFormat = s.nextInt();

        if (fontFormat == 1) { // If vertical
            for (int row = 0; row < (fontSize * 2) + 3; row++) {
                for (int col = 0; col < fontSize + 2; col++) {
                    if (row == 0 || row == 1 + fontSize || row == 2 + fontSize * 2) {
                        System.out.print(fontType); // Print the symbol if it is first,middle, and last
                    } else {
                        if (col == 0 || col == 1 + fontSize) { // Only print if it is first and last col
                            System.out.print(fontType);
                        } else {
                            System.out.print(" "); // others are space
                        }
                    }
                }
                System.out.println("");
            }

        } else { // If horizontal
            for (int row = 0; row < fontSize + 2; row++) {
                for (int col = 0; col < (fontSize * 2) + 3; col++) {
                    if (row == 0 || row == 1 + fontSize) { // Print whole row as symbol if is first and last low
                        System.out.print(fontType);
                    } else {
                        if (col == 0 || col == 1 + fontSize || col == 2 + fontSize * 2) {
                            System.out.print(fontType); // Print symbol if is first middle last col
                        } else {
                            System.out.print(" "); // Others are space
                        }
                    }

                }
                System.out.println();
            }

        }

    }

}
