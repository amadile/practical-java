public class Test<T,U> {
    T a;
    U b;
    Test(T a, U b) {
        this.a=a;
        this.b=b;
    }

    <O> void printMe(U r){
        System.out.println(r);
        System.out.println(r.getClass().getName());
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args){
        Test<Number,String> obj=new Test<Number,String>(99.88,"AMADILE MAJID SUNDAY");
        obj.printMe("JAVA 2 PROGRAMMING");
    }
}
