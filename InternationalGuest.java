import java.util.Scanner;
public class InternationalGuest extends MyGuest {
    int foreignFee;
    //constructor of International Guest
    public InternationalGuest(String name, String contact, String service, int ServiceCharge, foreignFee) {
        super(name, contact, service, ServiceCharge);
        this.foreignFee = foreignFee;
    
    }
    //method to print the details of the international guest
    public void printDetails() {
        super.printDetails();
        System.out.println("The rate of the discount is " + foreignFee);
        int Amount=ServiceCharge-foreignFee;
        System.out.println("The amount of the discount is " + Amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the local guest: ");
        String GuestName=scanner.nextLine();
        System.out.println("Enter the contact of the guest: ");
        String Contact=scanner.nextLine();
        System.out.println("Enter the service name of the guest: ");
        String ServiceName=scanner.nextLine();
        System.out.println("Enter the service charge of the guest: ");
        int ServiceCharge=scanner.nextInt();
        System.out.println("Enter the discount rate of the guest: ");
        double DiscountRate=scanner.nextDouble();

        InternationalGuest obj=new InternationalGuest(LocalGuestName, LocalContact, LocalServiceName, LocalServiceCharge, LocalDiscountRate);
        objGuest.printDetails();
    }

}


