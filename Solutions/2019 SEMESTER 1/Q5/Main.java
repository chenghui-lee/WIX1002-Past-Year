
public class Main {

    public static void main(String[] args) {
        Delivery a = new Delivery("Ali", "Ahmad", 4.4);
        Delivery b = new Delivery("Ah Chong", "Fatimah", 63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        SpecialDelivery d = new SpecialDelivery("Ang", "Liew", 19.0, true, true);
        
        double total = a.totalCost() + b.totalCost() + c.totalCost() + d.totalCost();
        
        System.out.println(a.toString() + "\n");
        System.out.println(b.toString() + "\n");
        System.out.println(c.toString() + "\n");
        System.out.println(d.toString() + "\n");
        System.out.println("The total shipping cost is RM" + total);
    }

}
