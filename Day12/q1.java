package Day12;
import java.util.*;
// write Function for Palindrome
public class q1 {
    public static int Palindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int rem= n%10;
            rev = rev*10 +rem;
            n= n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num==Palindrome(num)){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a Palindrome number");
        }
           sc.close();
}


}