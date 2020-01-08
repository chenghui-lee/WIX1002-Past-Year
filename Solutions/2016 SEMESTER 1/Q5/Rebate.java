
public class Rebate extends CreditCard{
    public Rebate(String name, String cardNumber) {
        super(name, cardNumber);
        super.type = "Cash Rebate";
    }
    
    public double payment(String item, double price){
        
        if (item.equalsIgnoreCase("fuel"))
            return totalReward += price*0.08;
        else if (item.equalsIgnoreCase("utility"))
            return totalReward += price*0.05;
        else if (item.equalsIgnoreCase("grocery"))
            return totalReward += price*0.02;
        else
            return totalReward += price*0.002;
    }
    
    
    public double getReward(){
        return totalReward;
        
    }
}
