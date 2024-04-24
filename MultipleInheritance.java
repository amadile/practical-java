public class MultipleInheritance implements Interface1, Interface2{
    // method1 implemtation
    public void method1(){
        System.out.println("This is the imlementation of method1");
    }
    //implementation of method2
    public void method2(){
        System.out.println("This is the implentation of method2");
    }
    public static void main(String[] args){
        MultipleInheritance obj =new MultipleInheritance();
        //calling method1
        obj.method1();
        //calling method2
        obj.method2();
        Interface1.StaticMethod1();
    }
}
