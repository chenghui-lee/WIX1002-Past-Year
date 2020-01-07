
public class Watermelon extends Fruit{
    private double weight;
    public Watermelon(String name, String type,double weight) {
        super(name, type);
        this.weight = weight;
    }

    @Override
    public double totalPrice() {
        if (type.equalsIgnoreCase("Local")){
            if (weight<=2)
                return weight*2.25;
            else if (weight<=5)
                return weight*1.95;
            else
                return weight*1.65;
        }
        else if (type.equalsIgnoreCase("Imported")){
            if (weight<=2)
                return weight*3.75;
            else if (weight<=5)
                return weight*3.45;
            else
                return weight*3.15;
        }
        else
            return 0;
        
    }
    
    public String toString(){
       
        return super.toString() + weight + "kg = RM " + totalPrice();
    }
    
}
