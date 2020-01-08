
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numOfTeam;
        System.out.print("Enter number of teams: ");
        numOfTeam = s.nextInt();
        s.nextLine();
        String[][] team = new String[numOfTeam][2];
        
        for (int i=0;i<numOfTeam;i++){
            System.out.print("Enter team " + (i+1) + " name: ");
            team[i][0] = s.nextLine();
            System.out.print("Enter team " + (i+1) + " score: ");
            team[i][1] = s.nextLine();
        }
        
        System.out.println("List of team with the highest team score first");
        // Bubble sort
        String[][] temp = new String[1][2];
            for (int pass =1; pass<team.length; pass++){
                for (int row=0; row<team.length-1; row++){
                    if (Integer.parseInt(team[row][1]) < Integer.parseInt(team[row+1][1])){
                        temp[0][0] = team[row][0];
                        temp[0][1] = team[row][1];
                        
                        team[row][0] = team[row+1][0];
                        team[row][1] = team[row+1][1];
                        
                        team[row+1][0] = temp[0][0];
                        team[row+1][1] = temp[0][1];
                    }
                }
            }
        
        for (int i=0;i<team.length;i++){
            System.out.print(team[i][0] + " (" + team[i][1] + ") | ");
        }
        
    }
    
}
