package Day6;
import java.util.*;
//Program to count set bits(1's) in a number
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        while(n>0){
            if(n%2==1)
                count++;
                n=n/2;
        }
        System.out.println("Set bits : " +count);
        sc.close();
    }
    
}
