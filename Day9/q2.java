package Day9;
import java.util.*;
// Print reverse number triangle
public class q2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
