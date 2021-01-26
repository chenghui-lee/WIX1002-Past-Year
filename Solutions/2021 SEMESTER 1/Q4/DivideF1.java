
import java.util.Arrays;

public class DivideF1 extends Eleven{

    public DivideF1(String fileName){
        super(fileName);
    }
    
    @Override
    public String divide() {
        String res = "Divisibility  Rule (Formula 1)\n";
        
        for(int num : arr){
            boolean ok = false; // can divide by 11 or not
            int left = 0, right = 0;
            int[] leftNum = new int[6], rightNum = new int[6]; // not possible to exceed 6 digits
            int i = 0, j = 0; // to iterate through the arrays later on
            
            res += num + " : |x| = | ("; // output later on
            int t = num; // store the number temporary
            int seq = 0; // to determine either left or right side
            
            while(t > 0){
                int digit = t % 10;
                t /= 10;
                if (seq++ % 2 == 0) {
                    left += digit;
                    leftNum[i++] = digit;
                }
                else{
                    right += digit;
                    rightNum[j++] = digit;
                }             
            }
            int abs = Math.abs(left - right);
            if (abs % 11 == 0) ok = true;
            for(i=i-1; i>0; i--) res += leftNum[i] + " + ";
            res += leftNum[0] + ") - (";
            for(j=j-1; j>0; j--) res += rightNum[j] + " + ";
            res += rightNum[0] + ") | = " + abs;
            if (ok) res += "\n" + abs + " modulus 11 = 0, " + num + " is divisible by 11\n\n";
            else res += "\n" + abs + " modulus 11 is not equal 0, " + num + " is not divisible by 11\n\n";
        }
        return res;
        
    }
    
}
