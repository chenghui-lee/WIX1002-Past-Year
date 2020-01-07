
public class GradedActivity {
    private int score;
    

    
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public char getGrade() {
        if (score>=90)
            return 'A';
        else if (score>=80)
            return 'B';
        else if (score>=70)
            return 'C';
        else if (score>=60)
            return 'D';
        else 
            return 'F';
    }
    public String toString(){
        return "Score: " + score + "\n" + 
                "Grade: " + getGrade() + "\n";
    }
    
}
