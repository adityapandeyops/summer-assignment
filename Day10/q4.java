package Day10;
import java.util.*;
// Program to print Character pyramid
public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=5;
        // outer loop
        for(int i=1; i<=n; i++){
            
            //inner loop
            // spaces
          for(int j=1; j<=n-i;j++){
            System.out.print(" ");
          }
          char ch='A';
          // character
          // 1st half character
          for(int j=1; j<=i; j++){
            System.out.print(ch+ " ");
            ch++;

          }
          ch -=2;
          // 2nd half character
          for(int j=1; j<i; j++){
            System.out.print(ch+ " ");
            ch--;
          }
          System.out.println();

        }
        sc.close();
    }
    
}
