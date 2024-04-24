public class Class1122 implements Interface11,Interface22 {
    public  void printMessage(){
        System.out.println(" Default method has been overridden");
        Interface11.super.printMessage();
        Interface22.super.printMessage();
    }
    public static void main(String[] args) {
        Class1122 obj = new Class1122();
        obj.printMessage();
    }
}
