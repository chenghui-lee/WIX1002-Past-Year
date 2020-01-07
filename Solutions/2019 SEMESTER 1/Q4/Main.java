
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println((int)' '-(int)'A');
        String textTemp = "";
        try {
            Scanner sc = new Scanner(new FileInputStream("myAmbition.txt"));
            System.out.println("The essay is : ");
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                System.out.println(temp);
                textTemp += temp;
            }
            // Calculate number of sentences and words
            System.out.println();
            String sentences[] = textTemp.split("\\.");
            System.out.println("Number of sentences : " + sentences.length);
            String words[] = textTemp.split(" ");
            System.out.println("NUmber of words : " + words.length);
            
            int character[] = new int[26];
            // To count number of each character in the word
            for (int i=0;i<words.length;i++){
                for (int j=0;j<words[i].length();j++){
                    words[i] = words[i].toUpperCase();
                    int index = (int)words[i].charAt(j) - (int)'A';
                    if (index<0)
                        break;
                    character[index]++;
                }
            }
            // To display the count
            for (int i=0; i<character.length;i++){
                System.out.print((char)(i+'A') + " : " + character[i] + " ");
                if ((i+1)%8==0)
                    System.out.println("");
            }

        } catch (IOException e) {
            System.out.println("Problem while importing file.");
        }
    }

}
