//This question is identical with 2019 Semester2 Q1

// import java.util.Scanner; // e1
public class Main {

    public static void main(String[] args) {
        int[] num = {34,15,12,27,74,23};
        int cnt =0;
        for (int i=0; i<num.length; i++){ // e2
            if (isEven(num[i]))//e3
                cnt++;
        }
        System.out.println("The number of even number is " + cnt);
        System.out.println("The sum of the array is " + getTotal(num)); //e4
    }
    public static boolean isEven(int a){ //e5
        if (a%2==0) //e6
            return true;
        else
            return false;
    }
    
    public static int getTotal(int[] a){ //e7
        int total =0;
        for (int i=0; i<a.length;i++)
            total += a[i]; //e8
        return total;
    }
}
