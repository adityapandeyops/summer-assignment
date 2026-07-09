package Day4;
import java.util.*;
//  TO find nth Fibonacci series

public class q2 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
System.out.println(b);
        }
        else {
            for(int i=3; i<=n; i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
        sc.close();
    }
    
}
