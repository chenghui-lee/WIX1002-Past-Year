
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 3 numbers [1-9] : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        char[] pick = {'+', '-', '*', '/'};
        boolean hasSolution = false;
        for(int i=0; i<4; i++){
            double res = 0;
            for(int j=0; j<4; j++){
                // infront first
                if (evaluate(pick[j], evaluate(pick[i], a, b), c) == 18){
                    hasSolution = true;
                    if (i < 2 && j > 1){ // need to add bracket
                        System.out.printf("(%d %c %d) %c %d = %d\n", a,pick[i],b,pick[j],c,18);
                    }else{
                        System.out.printf("%d %c %d %c %d = %d\n", a,pick[i],b,pick[j],c,18);
                    }
                }
                // behind first
                if (evaluate(pick[j], a, evaluate(pick[i], b, c)) == 18){
                    hasSolution = true;
                    if (i>1 && j<2){
                        System.out.printf("%d %c %d %c %d = %d\n", a,pick[j],b,pick[i],c,18);
                    }
                    else{
                        System.out.printf("%d %c (%d %c %d) = %d\n", a,pick[j],b,pick[i],c,18);
                    }
                }
            }
        }
        if (!hasSolution) System.out.println("No Solution");
    }
    public static double evaluate(char pick, double a, double b){
        switch(pick){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return a / b;
        }
    }
}
