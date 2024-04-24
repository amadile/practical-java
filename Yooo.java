public class Yooo implements L,M {
    public static void main(String[] args) {
        //System.out.println(age);// this line of code causes error since im calling variable age without interface name 
        System.out.println(L.age);// ouput 45
        System.out.println(M.age);// output 99
    }
}
