
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String name, id;
       int quantity;
       double ppu;
       
        System.out.print("Enter customer name :");
        name = s.nextLine();
        System.out.print("Enter customer id :");
        id = s.nextLine();
        System.out.print("Enter quantity ordered :");
        quantity = s.nextInt();
        System.out.print("Enter price per unit :");
        ppu = s.nextDouble();
        System.out.println("");
        
        Order a = new Order(name, id, quantity, ppu);
//        a.computePrice();
        System.out.println(a.toString());
        System.out.println("");
        
        ShippedOrder b = new ShippedOrder(name, id, quantity, ppu);
        System.out.println(b.toString());
        
        
        
    }
    
}
