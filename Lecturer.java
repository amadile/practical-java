public class Lecturer extends Person { // achieving inheritance through extends keyword 
    static int age=20;
    void printDetails(){
        System.out.println("This is sub class called Lecturer");
        System.out.println(age);
    }

    public static void main(String[] args){
        Lecturer obj=new Lecturer(); // creating the object of the subclass
        obj.printDetails();
    }
}
