public class OurClass implements OurInterface {
    public void printDetails(){
        System.out.println("The implementation of our method in the interface");
    }

    public static void main(String[] args) {
        OurClass obj = new OurClass();
        obj.printDetails();
        System.out.println(OurInterface.age); // this prints the age
        System.out.println(OurInterface.name); // this prints the name
    }
}