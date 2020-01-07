import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); //e1, e2
        int num, sum =0;
        do{
            System.out.print("Enter an integer number, -1 to quit.");
            num = a.nextInt(); // e3
            if (num==-1) //e4
                continue;
            if (num%2==0) //e5
                System.out.println("The number is an even number");
            else
                System.out.println("The number is an odd number");
            sum += num; //e6
        }while(num!=-1); //e7,e8
        System.out.printf("The sum of all integer number(s) is : %5d\n", sum); // e9
    }
    
}
