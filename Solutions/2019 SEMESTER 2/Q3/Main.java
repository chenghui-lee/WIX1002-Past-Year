
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        String quit;
        int a, b, c, ans;

        while (true) {
            a = r.nextInt(11);
            b = r.nextInt(11);
            c = a + b;
            System.out.print("What is " + a + " + " + b + " ? ");
            ans = s.nextInt();
            s.nextLine();
            System.out.println(a + " + " + b + " = " + ans + " is " + (ans == c));
            System.out.print("Do you want to try another question (y/n) ? : ");
            quit = s.nextLine();
            if (quit.equals("n")) 
                break;
            System.out.println("");
        }
        System.out.println("Program ends.");

    }

}
