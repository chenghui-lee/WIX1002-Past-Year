
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();

        // Write to file
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            System.out.print("The string generated is: ");
            for (int count = 0; count < 6; count++) {
                int temp = r.nextInt(58) + 65;
                if (temp >= 65 && temp <= 90 || temp >= 97 && temp <= 122) {
                    System.out.print((char) temp);
                    out.print((char) temp);
                } else {
                    count--; // To remove non-alphabet
                }
            }
            System.out.println();
            out.close();

        } catch (IOException e) {
            System.out.println("Problem while outputing file.");
        }
        
        // Read from file
        try {
            Scanner s = new Scanner(new FileInputStream("data.txt"));
            String temp = s.nextLine();
            char array[] = new char[6];
            // Store into char array
            for (int i = 0; i < temp.length(); i++) {
                array[i] = temp.charAt(i);
            }
            sort(array, '>');//ascending
            System.out.print("String sorted in ascending order: ");
            displayArray(array);
            sort(array, '<'); //descending
            System.out.print("String sorted in descending order: "); 
            displayArray(array);
            System.out.println("Original string from file: " + temp);

        } catch (IOException e) {
            System.out.println("Problem with input file.");
        }
    }

    
    
    public static void sort(char[] arr, char seq) {
        //ascending 
        if (seq == '>') {
            for (int pass = 0; pass < arr.length; pass++) {
                for (int i = 0; i < arr.length - 1; i++) {
                    char temp;
                    if ((int) arr[i] > (int) arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }else{
            for (int pass =0; pass<arr.length;pass++){
            for (int i=0;i<arr.length-1;i++){
                char temp;
                if ((int)arr[i] < (int)arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        }
    }
    
    public static void displayArray(char[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
