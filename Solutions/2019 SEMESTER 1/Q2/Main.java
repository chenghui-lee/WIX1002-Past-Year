
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = s.nextInt();

        int[][] arrayA = new int[N][N], arrayB = new int[N][N];
        generateMatrix(arrayA);
        generateMatrix(arrayB);
        System.out.println("Matrix A");
        displayMatrix(arrayA);
        System.out.println("Matrix B");
        displayMatrix(arrayB);
        System.out.println("Matrix A + B");
        displayMatrix(addMatrix(arrayA, arrayB));
        System.out.println("Matrix A X B");
        displayMatrix(multiplyMatrix(arrayA, arrayB));

    }

    public static void generateMatrix(int[][] array) {
        Random r = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = r.nextInt(10);
            }
        }
    }

    public static void displayMatrix(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrix(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int row = 0; row < array1.length; row++) {
            for (int col = 0; col < array1[row].length; col++) {
                result[row][col] = array1[row][col] + array2[row][col];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrix(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                for (int i=0;i<array1.length;i++){
                    result[row][col] += array1[row][i] * array2[i][col];
                }
            }
        }
        return result;
    }
}
