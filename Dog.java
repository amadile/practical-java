public class Dog extends Animal{
    // implementation of the abstract method
    void printDetails(){
        System.out.println("THis is the implementation of the abstract method ");
    }
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printDetails();

        // accessing the static method
        Animal.StaticMethod1();
    }
}
