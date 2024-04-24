public abstract class HakimCar extends RobinCar{
    //implementation of the dance() abstract method in RobinCar abstract class
    public void dance(){
        System.out.println("Dancing");
    }
    //implementation of cook()abstract method in RobinCar abstract class
    public void cook(){
        System.out.println("Cooking");
    }
    abstract double speed(double x, double y);
}
