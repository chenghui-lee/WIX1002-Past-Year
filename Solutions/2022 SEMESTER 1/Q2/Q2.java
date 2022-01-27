
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        
        try{
            Scanner s = new Scanner(new FileInputStream("diving.txt"));
            int lines = 0;
            while(s.hasNextLine()){
                lines ++;
                s.nextLine();
            }
            int numberOfRecords = lines / 5;
            s.close();
            
            Diving divers[] = new Diving[numberOfRecords];
            s = new Scanner(new FileInputStream("diving.txt"));
            for (int i = 0; i < numberOfRecords; i++) {
                String name = s.nextLine();
                String country = s.nextLine();
                double scores[][] = new double[3][7]; // 3 attempt, 7 judges
                double rating[] = new double[3];
                for (int attempt = 0; attempt < 3; attempt++) {
                    for (int judge = 0; judge < 7; judge++) {
                        scores[attempt][judge] = s.nextDouble();
                    }
                    rating[attempt] = s.nextDouble();
                }
                divers[i] = new Diving(name, country, scores, rating);
                if (i != numberOfRecords - 1) s.nextLine(); // capture the "next line" if not the last element
            }
            s.close();
            
            for (Diving d : divers) {
                System.out.println(d.toString());
                System.out.println("");
            }
            
            // sort the divers according to final score
            // bubble sort
            for (int pass = 0; pass < numberOfRecords; pass++) {
                for (int i = 0; i < numberOfRecords - 1; i++) {
                    if (divers[i].getFinalScore() < divers[i+1].getFinalScore()){
                        Diving t = divers[i+1];
                        divers[i+1] = divers[i];
                        divers[i] = t;
                    }
                }
            }
            
            System.out.printf("Gold : %s (%s)\n", divers[0].getName(), divers[0].getCountry());
            System.out.printf("Silver : %s (%s)\n", divers[1].getName(), divers[1].getCountry());
            System.out.printf("Bronze : %s (%s)\n", divers[2].getName(), divers[2].getCountry());
            
        }catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        }
        
    }
}
