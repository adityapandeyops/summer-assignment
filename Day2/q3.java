package Day2;
import java.util.*;
// Product of a number
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int product =1;
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        while(num>0){
            // product = product * (num%10);
            // num = num/10;
        int digit = num % 10;
        product = product * digit;
        num = num /10;
        }
        System.out.println("Product of a number : " +product);
        sc.close();
    }
    
}
