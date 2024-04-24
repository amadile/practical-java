public class ImlpementerClass implements FirstInterface, SecondInterface{
    //implementing the first interface method
    public void printDetails(){
        System.out.println("I am Implementation");
    }
    //implementing the second interface method
    public void secondMethod(){
        System.out.println("I am Second Method");
    }

    public static void main(String[] args) {
        ImlpementerClass obj = new ImlpementerClass();
        obj.printDetails();
        obj.secondMethod();
    }
}
