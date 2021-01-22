
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(new FileInputStream("raw.txt"));
            int count[] = new int[11];
            
            while(s.hasNextInt()){
                int t = s.nextInt();
                count[t]++;
            }
            System.out.println("Frequency Distribution Table");
            int max = 1, mode = -1;
            for(int i=2; i<=10; i++){
                if (i%2 == 0){
                    System.out.println(i + " : " + count[i]);
                    if (max < count[i]){
                        max = count[i];
                        mode = i;
                    }
                }
            }
            System.out.println("The mode of the dataset is : " + mode);
        }catch(IOException e){}
    }    
}
