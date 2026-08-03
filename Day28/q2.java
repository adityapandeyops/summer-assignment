package Day28;
import java.util.*;
// Wap to create bank account system.
public class q2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;

        System.out.println("Balance = " + balance);

        System.out.print("Enter Deposit Amount: ");
        int deposit = sc.nextInt();
        balance = balance + deposit;
        System.out.println("Balance = " + balance);

        System.out.print("Enter Withdraw Amount: ");
        int withdraw = sc.nextInt();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Final Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}
    

