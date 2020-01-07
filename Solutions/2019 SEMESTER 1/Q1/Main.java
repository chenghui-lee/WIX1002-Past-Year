import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println("This program shows the number of odd and even number from 10 random numbers. "
                + "The random numbers must be from 0 - 100");
        int num, odd=0, even=0;
        Random r = new Random(); // e1
        for (int i=1; i<=10; i++){ //e2,e3,e4
            num = r.nextInt(101); //e10
            System.out.print(num + " ");
            if (isEven(num)){
                odd++; //e5
            }
            else{
                even++; //e6
            }
        }
        System.out.println("\nNumber of odd number:" + odd);
        System.out.println("Number of even number:" + even); //e7
    }
    public static boolean isEven(int a){ //e8,e9
        if (a%2==0) //e11
            return true;
        else
            return false;
    }
    
}
