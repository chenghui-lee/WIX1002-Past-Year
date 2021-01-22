public class CloudPackage extends Cloud{
    private int cores, memory;
    private double pricePerHour;
    
    public CloudPackage(String name, double cost) {
        super(name, cost);
    }

    public CloudPackage(String name, int cores, int memory, double pricePerHour) {
        super(name, 0);
        this.cores = cores;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    public boolean check(Job a){
        return memory >= a.getMemory();
    }
    public double totalCost(Job a){
        cost = a.getNumberOfTasks() / cores * pricePerHour;;
        return cost;
    }
    
}
