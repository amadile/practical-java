public class GeneralClass {
    public static void main(String[] args){
        ImplementPortable yoo=new ImplementPortable();
        yoo.printName("MAN FROM NOWHERE");
        System.out.println(yoo.multiple(59,356));

        PortableImplementAgain fee=new PortableImplementAgain();
        fee.printName("LOS BLANCOS THE MADRID");
        System.out.println(fee.multiple(64,276));
    }
}
