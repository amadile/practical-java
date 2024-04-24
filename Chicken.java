public class Chicken extends Animal {
    //implementation of Animal by Chicken class
    void printDetails() {
        System.out.println("Chicken");
    }
    public static void main(String[] args){
        Chicken obj = new Chicken();
        obj.printDetails();
    }
}
