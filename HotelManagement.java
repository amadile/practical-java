import java.util.Scanner;
public class HotelManagement {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Guest as a superclass
    System.out.println("Enter the id of the guest:");
    String guestId = scanner.nextLine();
    System.out.println("Enter the name of the guest:");
    String guestName = scanner.nextLine();
    System.out.println("Enter the number of the days:");
    int numberOfDays = scanner.nextInt();

    //Resident guest
    System.out.println("Enter the room fees of the guest:");
    double roomFees = scanner.nextDouble();
    Resident resident=new Resident(guestId, guestName,numberOfDays,roomFees);
    System.out.println("\nResident guest details:");
    Resident.printGuestDetails();

    //Non-Resident guest
    System.out.println("Enter the entrance fee for the guest:");
    int entranceFees = scanner.nextInt();
    NonResident nonResident= new NonResident(guestId, guestName, numberOfDays, entranceFees);
    System.out.println("\nNonResident guest details:");
    NonResident.printGuestDetails();
    scanner.close();
    }
}
