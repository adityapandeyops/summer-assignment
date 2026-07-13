package Day7;
import java.util.*;
// Recursive of Sum of Digits
public class q3 {
    public static int sum(int num){
        int sum=0;
        while(num!=0){
            sum = sum+(num%10);
            num = num/10;
        }
        return sum;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num= sc.nextInt();
        System.out.println("Sum of digit : " +sum(num));
        sc.close();
    } 

}
