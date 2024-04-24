public class AmadileMajid implements Amadile,Majid{
    //@Override
    public void firstMethod(){
    System.out.println("I have overriden first method");
        Amadile.super.firstMethod();
        Majid.super.firstMethod();
    }
    public static void main(String[] args) {
        AmadileMajid obj=new AmadileMajid();
        obj.firstMethod();
    }
}
