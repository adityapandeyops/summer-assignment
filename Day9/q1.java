package Day9;
import java.util.*;
//Reverse star pattern
public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
