
public class ShippedOrder extends Order{
    
    
    public ShippedOrder(String customerName, String customerID, int quantityOrder, double unitPrice) {
        super(customerName, customerID, quantityOrder, unitPrice);
    }

    public double computeTotalPrice(){
        return computePrice() + 4 ;
    }

    @Override
    public String toString() {
        return "Shipped" + "\n" +
                "Order record" + "\n" +
                "Customer Name: " + customerName + "\n" + 
                "Customer ID: " + customerID + "\n" + 
                "Quantity: " + quantity + "\n" + 
                "Unit Price: " + unitPrice + "\n" +
                "Total Price : " + computeTotalPrice();
        
    }
    
    
}
