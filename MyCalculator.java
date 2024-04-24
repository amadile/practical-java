public class MyCalculator implements Calculator {
    public void add(double x, double y) {
        double sum = x + y;
        System.out.println(sum);
    }
    public void subtract(double x, double y) {
        double sub = x - y;
        System.out.println(sub);
    }
    public void multiply(double x, double y) {
        double mult=x*y;
        System.out.println(mult);
    }
    public void divide(double x, double y) {
        double div = x/y;
        System.out.println(div);
    }
    public void printResults(){
        System.out.println("This function prints the results of all the computations");
    }
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        obj.add(10.4, 20.6);
        obj.subtract(5.0, 1.0);
        obj.multiply(1.5, 3.0);
        obj.divide(900.0, 10.0);
        obj.printResults();
    }
}
