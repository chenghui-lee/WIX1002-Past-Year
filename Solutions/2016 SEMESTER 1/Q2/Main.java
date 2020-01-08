
import java.util.Random;
import java.util.Scanner;


public class Main {
    
static int playerScore=0, compScore =0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        while (playerScore <=3 && compScore <=3){
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            int pick = s.nextInt();
            int comp_pick = r.nextInt(3);
            checkWinner(pick,comp_pick);
            if (playerScore>=3){
                System.out.println("Player wins the game.");
                break;
            }else if (compScore>=3){
                System.out.println("Computer wins the game.");
                break;
            }
        }
    }
    public static void checkWinner(int human, int bot){
        String game[] = {"Paper", "Scissor", "Rock"};
        if (human-1 == bot){
            System.out.println("Player : " + game[human-1] + " ---- Computer : " + game[bot]);
            System.out.println("Tie");
        }else if (human==1 && bot == 2){
            System.out.println("Player : " + game[human-1] + " ---- Computer : " + game[bot]);
            playerScore++;
            System.out.println("Player win " + playerScore + " time(s)");
        }else if (human==2 && bot == 0){
            System.out.println("Player : " + game[human-1] + " ---- Computer : " + game[bot]);
            playerScore++;
            System.out.println("Player win " + playerScore + " time(s)");
        }else if (human==3 && bot == 1){
            System.out.println("Player : " + game[human-1] + " ---- Computer : " + game[bot]);
            playerScore++;
            System.out.println("Player win " + playerScore + " time(s)");
        }else{
            System.out.println("Player : " + game[human-1] + " ---- Computer : " + game[bot]);
            compScore++;
            System.out.println("Computer win " + compScore + " time(s)");
        }
            
        
    }
    
}
