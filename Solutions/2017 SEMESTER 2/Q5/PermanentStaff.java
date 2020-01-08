
public class PermanentStaff extends Staff{
    private String grade;

    public PermanentStaff(String name, String IC, String grade) {
        super(name, IC);
        this.grade = grade;
    }
    public int getSalary(){
        switch(grade){
            case "EM01":
                return 7000;
            case "EM02":
                return 5000;
            case "EM03":
                return 3000;
            case "EM04":
                return 1000;
            default:
                return 0;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "Grade: " + grade + "\n" +
                "Salary: RM " + getSalary() + "\n";
    }
}
