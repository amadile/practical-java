public class MyGuest {
    String name;
    String contact;
    String service;
    int ServiceCharge;
    final int tax=5;
    //constructor
    public MyGuest(String name, String contact, String service, int ServiceCharge){
        this.name = name;
        this.contact = contact;
        this.service = service;
        this.serviceCharge = serviceCharge;
    }
    //method to print the details of the guest
    void printDetails(){
        System.out.println("The name of the guest is: " + name);
        System.out.println("The contact of the guest is: " +contact);
        System.out.println("The service of the guest is: " + service);
        System.out.println("The charge of the service of the guest is: " + serviceCharge);
    }
}
