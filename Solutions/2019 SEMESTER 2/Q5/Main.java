
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter values for a, b and c : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        System.out.println("Discriment : " + (int)qe.Discriminant());
        if (qe.Discriminant() < 0)
            System.out.println("The equation has no roots");
        else{
            System.out.println("The roots : " + qe.calcRoot1() + " and " + qe.calcRoot2());
        }
            
    }

}
