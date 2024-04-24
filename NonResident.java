public class NonResident extends Guest {
    int EntranceFee;
    //constructor for the non resident class
    public NonResident(String GuestID, String GuestName, int Day, int EntranceFee){
        super(GuestID, GuestName, Day);
        this.EntranceFee = EntranceFee;
    }
    //method to print the details of the non resident
    public void printGuestDetails(){
        super.printGuestDetails();
        System.out.println("Entrance Fee: " + this.EntranceFee);
        int NonResidentAmount=EntranceFee*Day;
        System.out.println("Non Resident Amount: " + NonResidentAmount);
    }
}
