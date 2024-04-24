public class C implements X{
    public void m(){
        System.out.println("Instance method in interface C");
        X.super.m();
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.m();
    }
}
