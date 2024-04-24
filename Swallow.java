public class Swallow implements Cloneable {
    int age;
    String name;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Swallow obj1=new Swallow();
        obj1.age=19;
        obj1.name="CHELSEA";
        Swallow obj2=obj1;
        System.out.println(obj1.age);
        System.out.println(obj1.name);
        System.out.println(obj2.age);
        System.out.println(obj2.name);
        System.out.println();
        obj1.age=55;
        obj1.name="BARCELONA";
        //System.out.println(obj1.age);
        //System.out.println(obj1.name);
        System.out.println(obj2.age);
        System.out.println(obj2.name);
    }
}
