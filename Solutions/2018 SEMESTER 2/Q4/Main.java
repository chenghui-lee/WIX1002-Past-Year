
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the values for a, b, c, d, e and f : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        LinearEquation eq = new LinearEquation(a,b,c,d,e,f);
        System.out.println("The equation : ");
        System.out.println(eq.toString() +"\n");
        if(!eq.isSolvable())
            System.out.println("The equation has no solution.");
        else{
            System.out.println("x = " + eq.computeX() + "; y = " + eq.computeY());
        }
    }
    
}
