public class Other {
        
        int l = 50;
    
        // Non-static method
        public void nonStaticMethod() {
            System.out.println("This is a non-static method.");
            System.out.println( l);
        }
    
        public static void main(String[] args) {
        Other obj = new Other();
            obj.nonStaticMethod();
            System.out.println("Access non-static variable in static context: " + obj.l);
           // System.out.println( obj.l);
        }
    
}
