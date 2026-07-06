package Day8;
import java.util.*;
// pattern character triangle
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=5;
        
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
         char ch= 'A';
            for(int j=1; j<=i; j++){
            
        System.out.print(ch +" ");
           ch++;
            }
            System.out.println();
        }
        sc.close();
    }
        
    }
    

