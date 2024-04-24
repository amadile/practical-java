public class Resident extends Guest {
    double RoomFees;
    final int MunicipalFees=30;
    //constructor for Resident class
    Resident(String GuestID, String GuestName, int Day, double RoomFees){
        super(GuestID, GuestName, Day);
        this.RoomFees = RoomFees;
    }
    //print details of the guest
    public void printGuestDetails(){
        super.printGuestDetails();
        System.out.println("Room Fees: " + RoomFees);
        int ResidentAmount=RoomFees*Day + 30;
        System.out.println("Resident Amount: " + ResidentAmount);
    }
}
