import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final int N;
        Scanner s = new Scanner(System.in); //e1
        System.out.println("Enter a number: "); 
        N = s.nextInt(); //e2
        System.out.println("The first " + N + " triangular numbers");
        for (int i=1;i<=N;i++){ //e3,e4
            System.out.println(getTriangular(i) + " ");
            System.out.println();
        }
    }
    public static int getTriangular(int n){ //e5,e6
        int sum =0; //e7
        for (int i=1;i<=n;i++)
            sum += i; //e8
        return sum;
        
    }
    
}
