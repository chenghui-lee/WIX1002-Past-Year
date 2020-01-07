// 2019 Sem2 Q1
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] num = {66, 15, 20, 27, 74, 33}; //1 Removed quotes
        int cnt = 0;
        for (int k = 0; k<num.length; k++){ //2 Removed ()
            if(isEven(num[k])) //3 Added [k]
                cnt++;
        }
        System.out.println("The number of even integer is " + cnt);
        System.out.println("The biggest integer is " + findMax(num)); // Changed to num
        
    }
    
    public static boolean isEven(int a){ //4 Added static
        if (a%2 == 0)
            return true;
        else
            return false;
    }
    
    public static int findMax(int[] a){ //5 Changed return type
        int max = a[0];
        for (int n = 1; n<a.length; n++){ //6 Starting from n=1
            if (a[n] > max)
                max = a[n];
        }
        return max;
    }
    
} // end class
