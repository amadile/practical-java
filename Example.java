public class Example {
    static int number = 24;
    String name="MAN FROM NOWHERE";
    
    public static void staticMethod() {
        System.out.println("Static method");
    }
    
    public void nonStatic() {
        System.out.println("This is the non static method");
        staticMethod();
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.nonStatic();// this fixes the issue
        System.out.println("Number: " + number);
    }
}