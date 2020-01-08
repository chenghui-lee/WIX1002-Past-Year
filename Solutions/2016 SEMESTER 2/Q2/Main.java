
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = s.nextInt();
        int result =0;
        while (num > 0){
            result += num%10;
            num /=10;
        }
        System.out.println("The sum of the digits is " + result);
    }

}
