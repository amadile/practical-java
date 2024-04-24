public class OverrideEx extends MethodOverRidding {
    // Overriding the method from the superclass
    public void methodOverriding() {
        System.out.println("I am Override");
    }

    public static void main(String[] args) {
        OverrideEx obj = new OverrideEx();
        obj.methodOverriding(); // This will call the overridden method
    }
}
