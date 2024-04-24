public class JoabCar extends HakimCar {
    //implementation of the speed abstract method in the HakimCar abstract class
    double speed(double x, double y){
        return x*y; // logic for speed calculation
    }

    public static void main(String[] args) {
        RobinCar obj = new JoabCar();
        //calling the speed method and assigning it to the variable MySpeed
    double Myspeed=obj.speed(56.9,34.8);
        System.out.println(Myspeed);
        obj.dance();
        obj.cook();
    }
}
