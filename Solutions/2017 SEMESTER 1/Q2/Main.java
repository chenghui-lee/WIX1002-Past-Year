
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the intial tuition fee(i.e year 1): ");
        int initial = s.nextInt();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate = s.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = s.nextInt();
        System.out.printf("\nComputed tuition fee for year %d is %.2f",year,computeFee(initial,rate,year));
    }
    
    public static double computeFee(int init, double Rate, int yr){
        Rate = Rate/100 + 1;
        return init*Math.pow(Rate, yr-1);
    }
    
}
