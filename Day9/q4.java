package Day9;
import java.util.*;
//  Print hollow square pattern
public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n;j++){
                //cell => (i,j)
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
