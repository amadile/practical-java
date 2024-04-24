public class D {
    public static void main(String[] args) {
        C obj=new C(){
            public double mA(double r){
                return r;
            }
            public void mB(int k){
                System.out.println("The value of " + k  );
            }
        };
        C.mC();
        System.out.println("The value of KC is " + C.KC);
        System.out.println(obj.mA(7.9));
        obj.mB(56);
    }
}
