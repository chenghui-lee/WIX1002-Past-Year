
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("First complex numeber. Enter a number for the real part: ");
        double a1 = s.nextDouble();
        System.out.print("First complex numeber. Enter a number for the imaginary part: ");
        double a2 = s.nextDouble();
        System.out.print("Second complex numeber. Enter a number for the real part: ");
        double b1 = s.nextDouble();
        System.out.print("First complex numeber. Enter a number for the imaginary part: ");
        double b2 = s.nextDouble();
        Complex com1 = new Complex(a1, a2);
        Complex com2 = new Complex(b1, b2);
        System.out.println("First complex number: " + com1.toString());
        System.out.println("Second complex number: " + com2.toString());
        Complex result = com1.addComplexNum(com2);
        System.out.println("Addition of the two complex number: " + result.toString());
        result = com1.subtractComplexNum(com2);
        System.out.println("Subtraction of the two complex number: " + result.toString());
        
        
    }
    
}
