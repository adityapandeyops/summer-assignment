package Day10;
import java.util.*;
// Program to print star pyramid (half diamond pyramid)
public class q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
