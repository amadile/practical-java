public class Derived extends Base {
    int rollNo;
    String nickName;
    //constructor of Derived class
    Derived(int age,String name, String regNo, int rollNo, String nickName){
        super(age, name, regNo);
        this.rollNo = rollNo;
        this.nickName = nickName;
    }
}
