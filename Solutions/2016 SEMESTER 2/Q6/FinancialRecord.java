
public class FinancialRecord {
    private int id;
    private double balance, annualInterestRate;

    public FinancialRecord() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public FinancialRecord(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public void withdraw(double amount){
        System.out.println("Previous balance: RM" + balance);
        balance -= amount;
        System.out.println("Current balance after withdrawal of RM " +
                amount + " is: RM" +balance);
    }
    public void deposit(double amount){
        System.out.println("Previous balance: RM" + balance);
        balance += amount;
        System.out.println("Current balance after deposit of RM " +
                amount + " is: RM" +balance);
    }
    public String displayRecordInfo(){
        return "Financial record id is: " + id + "\n" +
                "Financial record balance is: RM" + balance + "\n" +
                "Annual interest rate is: " + annualInterestRate + "\n";
    }
    
    
}
