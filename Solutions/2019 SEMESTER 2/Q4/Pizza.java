
public class Pizza {
    private String size;
    private int numOfCheeseTopping, numOfBeefTopping, numOfChickenTopping, totalTopping;
    private double cost;
    
    public Pizza() {
    }

    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public String getSize() {
        return size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost(){
        totalTopping = numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping;
        if (size.equals("Small"))
            cost = 10 + 2*totalTopping;
        else if (size.equals("Medium"))
            cost = 12 + 2*totalTopping;
        else
            cost = 14 + 2*totalTopping;
        
        return cost;
            
    }
    public void display(){
        System.out.println("Pizza size: " + size);
        System.out.println("Number of Cheese Topping: " + numOfCheeseTopping);
        System.out.println("Number of Beef Topping: " + numOfBeefTopping);
        System.out.println("Number of Chicken Topping: " + numOfChickenTopping);
        System.out.println("Cost: $ " + cost);
        
    }
    
}
