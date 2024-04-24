
    // Usage example
public class Main {
    public static void main(String[] args) {
        BillingFactory factory = new BillingFactory();
        
        // Create an insurance billing object
        Billing insuranceBilling = factory.createBilling("insurance");
        insuranceBilling.processBilling();
        
        // Create a direct payment billing object
        Billing directPaymentBilling = factory.createBilling("direct");
        directPaymentBilling.processBilling();
    }
}

