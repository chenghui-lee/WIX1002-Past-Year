
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int AAA = 0, AA = 0, A = 0;
        System.out.print("Enter N number: ");
        int N = s.nextInt();
        System.out.print("The random numbers are: ");
        for (int i = 1; i <= N; i++) {
            int temp = r.nextInt(101)+50;
            System.out.print(temp + " ");
            switch (temp%10) {
                case 0:
                case 1:
                case 2:
                case 3:
                    AAA++;
                    break;
                case 4:
                case 5:
                case 6:
                    AA++;
                    break;
                default:
                    A++;
                    break;
            }

        }
        System.out.println();
        System.out.println("Group AAA : " + AAA);
        System.out.println("Group AA : " + AA);
        System.out.println("Group A : " + A);

    }

}
