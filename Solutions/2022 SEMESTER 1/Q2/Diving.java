
import java.util.Arrays;

public class Diving {
    private String name;
    private String country;
    private double[][] scores;
    private double[] ratings;
    
    public Diving(){
        name = "";
        country = "";
        scores = new double[3][7];
        ratings = new double[3];
    }

    public Diving(String name, String country, double[][] scores, double[] ratings) {
        this.name = name;
        this.country = country;
        this.scores = scores;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    
    public double getFinalScore(){
        double result = 0;
        for (int i = 0; i < scores.length; i++) {
            Arrays.sort(scores[i]);
            double score = 0;
            for (int j = 2; j < scores[i].length - 2; j++) {
                score += scores[i][j];
            }
            score *= ratings[i];
            result += score;
        }
        
        return result;
    }
    @Override
    public String toString(){
        String stats = "";
        for (int i = 0; i < scores.length; i++) {
            stats += "Judges Scores : ";
            for (int j = 0; j < scores[i].length; j++) {
                stats += scores[i][j] + " ";
            }
            stats += "\nDifficulty Rating : " + ratings[i] + "\n";
        }
        return String.format("Diver : %s (%s)\n"
                + "%s"
                + "Final Score : %.2f", name, country, stats, getFinalScore());
    }
}
