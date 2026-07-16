package Day12;
import java.util.*;
// Write function for Fibonacci
public class q3 {
    public static int fibonacci(int n){
        int a=0, b=1,c;
        for(int i=1; i<=n; i++){
            System.out.print(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of a terms: ");
        int n=sc.nextInt();
        fibonacci(n);
        sc.close();
    }
    
}
