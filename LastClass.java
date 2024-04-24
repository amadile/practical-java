public class LastClass implements LastInterface{
    public void LastMethod(){
        System.out.println("Last Method");
    }

    public void secondMethod(){
        System.out.println("Second Method");
    }

    public static void main(String[] args) {
        LastClass obj = new LastClass();
        obj.LastMethod();
        obj.secondMethod();
    }
}
