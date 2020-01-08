
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = s.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = s.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = s.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = s.nextInt();
        
        Essay a = new Essay(grammar, spelling, length, content);
        System.out.println("\nEssay score:");
        System.out.println(a.toString());
        
        int total = grammar + spelling + length + content;
        a.setScore(total);
        System.out.println("Total Score:" + a.getScore());
        System.out.println("Essay grade: " + a.getGrade());
        
    }

}
