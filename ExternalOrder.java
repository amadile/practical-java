public class ExternalOrder extends Order {
    String CustomerContact;
    // constructor of ExternalOrder class
    ExternalOrder(String OrderID, String ProductOrdered, int QuantityOrdered, String CustomerContact){
        super(OrderID,ProductOrdered, QuantityOrdered);
        this.CustomerContact = CustomerContact;
    }
    // @Override
    public void printOrders(){
        System.out.println("The the unique id of the product is:"+" "+OrderID);
        System.out.println("The product ordered is:"+" "+ProductOrdered);
        System.out.println("The quantity of the product ordered is"+" "+QuantityOrdered);
        System.out.println("The contact of the customer is in inform of emails"+" "+CustomerContact);
    }

    public static void main(String[] args) {
        ExternalOrder obj = new ExternalOrder("123456789", "Apple", 2, "prepare@apple.com");
        obj.printOrders();

    }
}
