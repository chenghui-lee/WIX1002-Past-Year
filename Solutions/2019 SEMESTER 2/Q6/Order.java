
public class Order {
    protected String customerName, customerID;
    protected int quantity;
    protected double unitPrice;
    
    
    public Order(){
        customerName = "";
        customerID = "";
        quantity = 0;
        unitPrice = 0;
    }

    public Order(String customerName, String customerID, int quantity, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double computePrice(){
        double totalPrice;
        totalPrice = quantity * unitPrice;
        return totalPrice;
    }
    
    @Override
    public String toString(){
        return "Order record" + "\n" +
                "Customer Name: " + customerName + "\n" + 
                "Customer Id: " + customerID + "\n" + 
                "Quantity ordered: " + quantity + "\n" + 
                "Unit Price: " + unitPrice + "\n" +
                "Total Price : " + computePrice();
        
    }
    
}
