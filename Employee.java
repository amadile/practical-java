public class Employee {
    String message="Hello Guys of Java Group";
    int EmployeeId=435;
    public void printMessage(){
        System.out.println(message);
    }
    public static void main(String[] args){
        Employee employee = new Employee();
        System.out.println(employee.EmployeeId);

        Employee.detailsMethod();
        String EmployeeName="MAN FROM NOWHERE";//local variable 
        System.out.println(EmployeeName);
        employee.printMessage();
    }

    public static void detailsMethod(){
        System.out.println("Static method");
        System.out.println(EmployeeName);
    }
}
