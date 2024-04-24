public class MyFunction {
    void add_sub(int x, int y){
        int sum=x+y;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction();
        myFunction.add_sub(2,4);
    }
}
