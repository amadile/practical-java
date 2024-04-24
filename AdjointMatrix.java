import java.util.*;
public class AdjointMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the matrix");
        System.out.println("Enter the element a");
        int a=sc.nextInt();
        System.out.println("Enter the element b");
        int b=sc.nextInt();
        System.out.println("Enter the element c");
        int c=sc.nextInt();
        System.out.println("Enter the element d");
        int d=sc.nextInt();
        // calculate and display adjoint matrices
        int adjA[][]={{d, -b},
            {-c, a}
        };
        System.out.println("original matrix is");
        System.out.println("|"+a+":"+b+"|");
        System.out.println("|"+c+":"+d+"|");

        System.out.println("Adjoint matrix");
        System.out.println("|"+adjA[0][0]+"|"+adjA[0][1]+"|");
        System.out.println("|"+adjA[1][0]+"|"+adjA[1][1]+"|");
        sc.close();
    }
}
