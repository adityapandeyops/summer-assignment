package Day7;
import java.util.*;
//Recursive reverse number
public class q4 {
    public static int rev=0;     //public static int reverse(int n , int rev){
   public static int reverse(int n){
        if(n==0)               //  if(n==0)
         return rev;           //return rev;
         rev = rev*10 + (n%10); //return reverse(n/10, rev*10 + n%10);}
         return reverse (n/10); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("Reverse : " +reverse(num));
        sc.close();
    }
}
