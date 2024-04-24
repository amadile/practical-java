public class MyClass implements MyInterface {
    public void AbMethod(){
        System.out.println("Abstract method");
    }

/*  public void printDetails(){
        System.out.println("default method");
    }*/

    public static void main(String[] args) {
        MyInterface obj = new MyClass(); // creating the instance of the interface(MyInterface)
        obj.AbMethod();
        obj.printDetails();
    }
}
