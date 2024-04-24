public class ConstructorOverloading {
    String name;
    int age;
    double mark;

    //Default constructor
    ConstructorOverloading(){
        System.out.println("This is the Default constructor");
    }

    //constructor with 2 parameters
    ConstructorOverloading(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("This constructor will print"+" "+name+" "+age);
    }

    //constructor with 3 parameters
    ConstructorOverloading(String name, int age, double mark){
        this.name=name;
        this.age=age;
        this.mark=mark;
        System.out.println("This outputs " + name + " "+ age + " " + mark);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1= new ConstructorOverloading();
        ConstructorOverloading obj2= new ConstructorOverloading("MAN FROM NOWHERE",23);
        ConstructorOverloading obj3= new ConstructorOverloading("AMADILE",45,7.67);
    }
}
