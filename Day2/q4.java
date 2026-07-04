package Day2;
import java.util.*;
//  Palindrome of a number
public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rev=0;
        System.out.print("Enter a number : ");
        int num= sc.nextInt();
        int temp;
        temp=num;
        // int rem
        while(num>0){
             rev = rev*10 + (num%10);    // rem = num%10;
            num = num/10;

        }
        if(temp==rev){
            System.out.println("The number is Palindrome ");
        }
        else{
            System.out.println("The number is not Palindrome");
        }
        sc.close();


    }
    
}
