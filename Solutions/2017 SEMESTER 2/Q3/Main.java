
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int N = s.nextInt();
        int[] numbers = new int[N];
        
        for (int i=0;i<numbers.length;i++){
            numbers[i] = r.nextInt(10001);
        }
        System.out.print("The random integer : ");
        displayArray(numbers);
        System.out.println("\nMinimum Number : " + minNumber(numbers));
        System.out.print("The approximation of the integer to the nearest hundred : ");
        round(numbers);
        reverse(numbers);
        System.out.print("\nThe random integer in reverse order : ");
        displayArray(numbers);
    }
    public static void displayArray(int[] array){
        for (int i =0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int minNumber(int[] array){
        int min =array[0];
        for (int i =0;i<array.length;i++){
           if (array[i]<min)
               min = array[i];
        }
        return min;
    }
    public static void round(int[] array){
        for (int i=0;i<array.length;i++){
            double temp = array[i];
            System.out.print(Math.round(temp/100)*100 + " ");
        }
    }
    
    public static void reverse(int[] array){
        // modulus 10, then result*10 + modulus, /10
        for (int i=0;i<array.length;i++){
            int result =0;
            while (array[i]>0){
                int lastDigit = array[i]%10;
                result = result*10 + lastDigit;
                array[i] /= 10;
             }
            array[i] = result;
        }
    }
    
}
