public interface MyInterface {
    default void printDetails(){
        System.out.println("default method");
    }
    void AbMethod();
}
