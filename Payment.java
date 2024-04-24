import java.util.Scanner;
public class Payment {
    int amount;
    String currency;

    public Payment(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    void getDetails(){
        System.out.println("Amount: "+amount);
        System.out.println("Currency: "+currency);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creating  array of 5 objects
        Payment[] payments=new Payment[5];
        for(int i=0;i<payments.length;i++){
            System.out.println("Enter the details of the Payment class"+" "+(i+1));
            System.out.println("Enter the amount of the Payment class:");
            int amount=scanner.nextInt();
            System.out.println("Enter the currency of the Payment class:");
            String currency=scanner.next();
            payments[i]=new Payment(amount,currency);
            //printing the Payment details
            for(Payment hi:payments){
                hi.getDetails();
            }
            
        }
        scanner.close();
    }
}