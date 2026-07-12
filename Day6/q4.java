package Day6;
import java.util.*;
// Program to find x^n without pow()
public class q4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n= sc.nextInt();
        int result=1;
        for(int i=1; i<=n; i++){
            result = result*x;
        }
           System.out.println("Answer = " +result);
           sc.close();
    }
    
}
