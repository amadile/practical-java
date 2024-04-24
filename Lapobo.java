public class Lapobo extends Kevin {
    int age=18;
    void printName(){
        System.out.println("This is superclass");

    //static void myMethod(){
       // System.out.println("Static method in superclass");
    //}
    }

    public static void main(String[] args){
        Lapobo obj=new Lapobo();
        obj. printName();
        System.out.println(obj.age);
    }
}
