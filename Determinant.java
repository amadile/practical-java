import java.util.*;
public class Determinant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elemnts of the 2x2 matrix: ");
        System.out.println("Enter element a: ");
        int a=scanner.nextInt();
        System.out.println("Enter element b: ");
        int b=scanner.nextInt();
        System.out.println("Enter element c: ");
        int c=scanner.nextInt();
        System.out.println("Enter element d: ");
        int d=scanner.nextInt();
        //Calculate the determinant of the matrix
        int determinant =a*d-b*c;
        //print the determinant
        System.out.println("The determinant of the matrix is: "+determinant);
        scanner.close(); //close the scanner and close the output file handle
    }
}
