
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        double s = sc.nextDouble();
        System.out.printf("The area is: %.2f\n squared meters." , area(n, s));
        
        
    }
    
    public static double area(int n, double s){
        double temp = Math.toRadians(180/n);
        return (n*s*s)/(4*Math.tan(temp));
        
    }
    
}
