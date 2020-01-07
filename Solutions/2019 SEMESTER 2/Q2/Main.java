
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double totalPrice, totalPriceWithTax, unitWeight;
        int numberOfBags;
        
        System.out.print("Enter the number of bags sold : ");
        numberOfBags = s.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        unitWeight = s.nextDouble();
        
        totalPrice = unitWeight * numberOfBags * 5.99;
        totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        
        System.out.println("");
        System.out.println("Price per kilogram : $5.99");
        System.out.println("Sales tax :         7.25%");
        System.out.printf("Total price :    $ %.2f\n" , totalPriceWithTax);
    }
    
}
