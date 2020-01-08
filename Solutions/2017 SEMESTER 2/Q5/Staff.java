
public class Staff {
    protected String name, IC;

    public Staff(String name, String IC) {
        this.name = name;
        this.IC = IC;
    }
    @Override
    public String toString(){
        return "Full Name: " + name + "\n" + 
                "IC: " + IC + "\n";
    }
}
