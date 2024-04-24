public class Deep implements Cloneable {
    int rollNumber;
    String name;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        Deep obj1 = new Deep();
        obj1.rollNumber=1;
        obj1.name="Me";
        Deep obj2=new Deep();
        obj2.rollNumber=obj1.rollNumber;
        obj2.name=obj1.name;
        System.out.println(obj2.rollNumber);
        System.out.println(obj2.name);
        System.out.println();
        obj1.rollNumber=5;
        obj1.name="FINALIST";
        System.out.println(obj2.rollNumber);
        System.out.println(obj2.name);

        

    }
}
