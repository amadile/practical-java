public class JustClass implements P {
    public void methodS(){
        System.out.println("Method S");
    }
    public int add(int a, int b){
        return a+b;
    }
    

    public static void main(String[] args) {
        JustClass obj = new JustClass();
        obj.methodS();
        int sum=obj.add(2,4);
        System.out.println(sum);
    }
}
