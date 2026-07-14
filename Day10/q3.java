package Day10;
import java.util.*;
//program to print number pyramid
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=5;
        //outer loop
        for(int i=1; i<=n;i++){
            //inner loop
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // numbers
            // print 1st half number
            for(int j=1; j<=i;j++){
                System.out.print(j+ " ");
            }
            // print 2nd half number
            for(int j=i-1; j>=1; j--){
                System.out.print(j+ " ");
            }
            System.out.println();
            }
            sc.close();
        }
    }
    

