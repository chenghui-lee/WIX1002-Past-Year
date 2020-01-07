
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String winner = "";
        double highestScore = 0;
        try {
            Scanner s = new Scanner(new FileInputStream("Q4.txt"));
            while (s.hasNextLine()) {
                double[] scores = new double[5];
                double finalScore = 0;
                int difficulty;

                String temp = s.nextLine();
                String[] line = temp.split(",");

                //Parse the scores from the line into score array
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = Double.parseDouble(line[i + 1]);
                }
                Arrays.sort(scores); // Sort the array for removing the lowest and highest
                difficulty = Integer.parseInt(line[line.length - 1]);

                // Calculate the final score
                for (int i = 1; i < scores.length - 1; i++) {
                    finalScore += scores[i];
                }
                finalScore *= difficulty;

                //Determine the winner and store the winner's name
                if (finalScore > highestScore) {
                    highestScore = finalScore;
                    winner = line[0];
                }
                System.out.println(line[0] + " score " + finalScore);

            }
            s.close();
            System.out.println("Winner is " + winner);

        } catch (IOException e) {
            System.out.println("Problem with input file.");
        }
    }

}
