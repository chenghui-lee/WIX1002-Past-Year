public class DivideF2 extends Eleven{
    
    public DivideF2(String fileName){
        super(fileName);
    }
    
    
    @Override
    public String divide() {
        String res = "Divisibility Rule (Formula 2)\n";
        for(int num : arr){
           int t = num;
           res += num + ", : ";
           while(t >= 100){
               int digit = t % 10;
               t = t/10;
               res += t + " - " + digit + " * 1 = " + (t-digit) + ", ";
               t -= digit;
           }
           res += "x = " + t + "\n";
           if (t % 11 == 0) res += t + " modulus 11 = 0, " + num + " is divisible by 11\n\n";
           else res += t + " modulus 11 is not equal to 0, " + num + " is not divisible by 11\n\n";
        }
        return res;
    }
    
}
