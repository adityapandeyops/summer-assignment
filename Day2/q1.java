package Day2;
import java.util.*;
// sum of digit

public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int num = 0;
        // int sum = 0;
        int num = sc.nextInt();
        int sum=0;
        System.out.print("Enter a numbrer : ");
        while(num>0) {
            sum+= num%10;
            num=num/10;
        }
        System.out.println(sum);
        sc.close();
    }

    
}
