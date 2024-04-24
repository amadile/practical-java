public class Gold implements Cloneable{
    String name;
    public Gold clone() throws CloneNotSupportedException{
        return (Gold)super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Gold obj1=new Gold();
        obj1.name="JUST";
        Gold obj2=(Gold)obj1.clone();
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        obj1.name="ADVANCED JAVA";
        System.out.println(obj2.name);
    }
    
}
