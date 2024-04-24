public class Guest {
    String GuestID;
    String GuestName;
    int Day;
    //constructor for guest class
    Guest(String GuestID, String GuestName, int Day){
        this.GuestID = GuestID;
        this.GuestName = GuestName;
        this.Day = Day;
    }
    //method to print guest details
    void printGuestDetails(){
        System.out.println("Guest ID: " + GuestID);
        System.out.println("Guest Name: " + GuestName);
        System.out.println("Day: " + Day);
    }
}
