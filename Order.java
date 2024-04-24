public abstract class Order {
    String OrderID;
    String ProductOrdered;
    int QuantityOrdered;

    //Constructor
    public Order(String OrderID, String ProductOrdered, int QuantityOrdered) {
        this.OrderID = OrderID;
        this.ProductOrdered = ProductOrdered;
        this.QuantityOrdered = QuantityOrdered;
    }

    //Abstarct method
    abstract void printOrders(); 
}
