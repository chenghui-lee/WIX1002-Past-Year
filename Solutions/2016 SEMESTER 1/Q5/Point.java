
public class Point extends CreditCard{
    public Point(String name, String cardNumber) {
        super(name, cardNumber);
        super.type = "Point Reward";
    }
    public double payment(String day, double price){
        if (day.equalsIgnoreCase("friday"))
            return totalReward += Math.floor(price)*2;
        else if (day.equalsIgnoreCase("saturday"))
            return totalReward += Math.floor(price)*3;
        else if (day.equalsIgnoreCase("sunday"))
            return totalReward += Math.floor(price)*4;
        else
            return totalReward += Math.floor(price);
    }
    
    public double getReward(String day, double price){
        return totalReward;
    }
    
}
