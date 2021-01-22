public class Cloud {
    protected String name;
    protected double cost;

    public Cloud(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Cloud package: " + name + " Total Cost= " + cost;
    }
    
    
    
}
