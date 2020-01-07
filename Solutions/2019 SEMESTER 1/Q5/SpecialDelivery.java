
public class SpecialDelivery extends Delivery {

    private boolean weekend, nighttime;

    public SpecialDelivery(String sender, String recipient, double weight, boolean week, boolean night) {
        super(sender, recipient, weight);
        weekend = week;
        nighttime = night;
    }

    @Override
    public double totalCost() {
        if (weekend && nighttime) {
            return (super.totalCost() + 50) * 1.2;
        } else if (weekend) {
            return super.totalCost() + 50;
        } else if (nighttime) {
            return super.totalCost() * 1.2;
        } else {
            return totalCost();
        }
    }
    @Override
    public String toString(){
        String result = "";
        result += "From : " + sender + " To: " + recipient + "\n" +
                "Weight of Package : " + weight + " kg" + "\n" + 
                "Shipping Cost : RM" + totalCost();
        if (weekend)
            result += "\nWeekend Delivery";
        if (nighttime)
            result += "\nNight Time Delivery";
        return result;
    }

}
