
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = s.nextDouble();
        System.out.printf(pounds + " pounds is %.3f kilograms\n", pounds*0.454);
    }
    
}
