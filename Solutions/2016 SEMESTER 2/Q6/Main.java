
public class Main {

    public static void main(String[] args) {
        FinancialRecord acc_b = new FinancialRecord(1001,20_000);
        acc_b.setAnnualInterestRate(8);
        System.out.println("The information about financial record acc_b is as follows.");
        System.out.print(acc_b.displayRecordInfo());
        System.out.println("The monthly interest rate is: " + acc_b.getMonthlyInterestRate());
        acc_b.deposit(1500);
        acc_b.withdraw(500);
    }
    
}
