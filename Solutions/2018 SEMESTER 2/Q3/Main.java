
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(new FileInputStream("student.txt"));
            String record[][] = new String[10][2];
            String[] names = new String[10];
            int[] marks = new int[10];
            
            // Parse the text inside the file into array
            while (s.hasNextLine()){
                for (int i=0; i<record.length; i++){
                    String temp = s.nextLine();
                    record[i] = temp.split(", ");
                    names[i] = record[i][0];
                    marks[i] = Integer.parseInt(record[i][1]);
                }
            }
            // To search for highest and lowest mark
            int maxIndex = 0;
            int minIndex = 0;
            int absent = 0;
            
            for (int i=0;i<marks.length;i++){
                if (marks[i] == -1)
                    absent ++;
                else if (marks[i]>marks[maxIndex])
                    maxIndex = i;
                else if (marks[i]<marks[minIndex])
                    minIndex = i;
                
            }
            // To display the result
            System.out.println("The student with the highest mark : " + names[maxIndex] + " " + marks[maxIndex]);
            System.out.println("The student with the lowest mark : " + names[minIndex] + " " + marks[minIndex]);
            System.out.println("The number of students who were absent from the exam : " + absent);
            
        }catch(FileNotFoundException e){
            System.out.println("File cannot be found.");
        }
    }
    
}
