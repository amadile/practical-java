
    // Factory class for creating billing objects
public class BillingFactory {
    public Billing createBilling(String type) {
        if (type.equalsIgnoreCase("insurance")) {
            return new InsuranceBilling();
        }
        else if (type.equalsIgnoreCase("direct")) {
            return new DirectPaymentBilling();
        }
        return null;
    }
}

