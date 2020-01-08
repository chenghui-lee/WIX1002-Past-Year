
public class PartTimeStaff extends Staff {
    private int hours;
    
    public PartTimeStaff(String name, String IC, int hours) {
        super(name, IC);
        this.hours = hours;
    }
    public int getSalary(){
        return hours*40;
    }
    @Override
    public String toString(){
        return super.toString() + "Number of working hours: " + hours +"\n" +
                "Salary: RM " + getSalary() + "\n";
    }
    
    
}
