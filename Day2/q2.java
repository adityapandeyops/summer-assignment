package Day2;
import java.util.*;
//  Reverse of a number
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rev=0;
        System.out.print("Enter a number : ");
        int num = sc.nextInt(); 
        while(num>0){
            rev= rev*10 + (num%10);
            num = num/10;

        }

            System.out.println("Reverse of a number : " +rev);

            sc.close();
    }
    
}
