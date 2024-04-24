public interface UniqueInterface {
    public static void methodStatic(){ 
        System.out.println("This is a static method");
        UniqueInterface obj=new UniqueClass();
        obj.methodPrivate();
    }
    private void methodPrivate(){
        System.out.println("This is a private method");
    }
}
