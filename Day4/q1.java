package Day4;
import java.util.*;
// Fibonacci series

public class q1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=1; i<=n; i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
        sc.close();
    }
    
}
