public class Job {
    private String name;
    private int numberOfTasks, memory;

    public Job(String name, int numberOfTasks, int memory) {
        this.name = name;
        this.numberOfTasks = numberOfTasks;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Job Name : " + name + " Memory = " + memory + "GB Number of Task = "
                + numberOfTasks;
    }
     
    
}
