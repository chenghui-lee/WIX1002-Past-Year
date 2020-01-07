
public class Apple extends Fruit{
    private int quantity;

    public Apple(String name, String type,int num) {
        super(name, type);
        quantity = num;
    }

    @Override
    public double totalPrice() {
        if (type.equalsIgnoreCase("green"))
            return quantity*1.2;
        else 
            return quantity*1.8;
    }
    public String toString(){
        return super.toString() + quantity + " = RM " + totalPrice();
    }
    
}
