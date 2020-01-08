
public class CreditCard {
    protected String name, cardNumber, type;
    protected double Reward;
    protected static double totalReward =0;

    public CreditCard(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public double getReward() {
        if (type.equalsIgnoreCase("cash rebate"))
            return totalReward;
        else
            return Math.floor(totalReward/100);
    }

    public void setReward(double cashReward) {
        this.totalReward = cashReward;
    }
    
    @Override
    public String toString(){
        return "Credit Card : " + name + "(" + cardNumber + ")" + "\n" + 
                "Card Type : " + type + "\n"  +
                "Total Cash Reward : " + getReward() +"\n";
    }
    
}
