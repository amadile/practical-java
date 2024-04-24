import java.util.Scanner;
public class LocalGuest {
    double DiscountRate;
    //constructor of LocalGuest
    public LocalGuest(String name, String contact, String service, int ServiceCharge, double DiscountRate) {
        super(name, contact, service, ServiceCharge);
        this.DiscountRate = DiscountRate;
    
    }
    //method to print the details of the guest
    public void printDetails() {
        super.printDetails();
        System.out.println("The rate of the discount is " + this.DiscountRate);
        double Amount=ServiceCharge-DiscountRate;
        System.out.println("The amount of the discount is " + Amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the local guest: ");
        String LocalGuestName=scanner.nextLine();
        System.out.println("Enter the contact of the guest: ");
        String LocalContact=scanner.nextLine();
        System.out.println("Enter the service name of the guest: ");
        String LocalServiceName=scanner.nextLine();
        System.out.println("Enter the service charge of the guest: ");
        int LocalServiceCharge=scanner.nextInt();
        System.out.println("Enter the discount rate of the guest: ");
        double LocalDiscountRate=scanner.nextDouble();

        LocalGuest objGuest=new LocalGuest(LocalGuestName, LocalContact, LocalServiceName, LocalServiceCharge, LocalDiscountRate);
        objGuest.printDetails();
    }

}
