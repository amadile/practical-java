public class ManFromNowhere implements W,S {
    public void methodW(){
        System.out.println("This is the implementation of method in interface W");
    }
    public void methodS(){
        System.out.println("This is the implementation of method in interface S");
    }

    public static void main(String[] args) {
        ManFromNowhere obj = new ManFromNowhere();
        obj.methodW();
        obj.methodS();
    }
    
}
