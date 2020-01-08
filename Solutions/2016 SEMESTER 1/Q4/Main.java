
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(new FileInputStream("Q4.txt"));
            while (s.hasNextLine()){
                String temp = s.nextLine();
                boolean strong = check(temp);
                if (strong)
                    System.out.println("Strong password.");
                else
                    System.out.println("Not a strong password.");
                        
            }
            s.close();
        }catch(IOException e){
            System.out.println("Problem with input file.");
        }
    }
    public static boolean check(String a){
        boolean length = a.length()>=8;
        boolean upper = false, lower = false, digit = false, special = false;
        for (int i=0;i<a.length();i++){
            char temp = a.charAt(i);
            if ((int)temp >= (int)'A' && (int)temp <= (int)'Z')
                upper = true;
            else if ((int)temp >= (int)'a' && (int)temp <= (int)'z')
                lower = true;
            else if ((int)temp >= (int)'0' && (int)temp <= (int)'9')
                digit = true;
            else{
                if ((int)temp != (int)' ')
                    special = true;
            }
        }
        return length && upper && lower && digit && special;
    }
    
}
