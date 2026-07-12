package Day6;
import java.util.*;
//DEcimal to Binary
public class q1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int bin=0 , place=1;
        while(n>0){
            int rem= n%2;
            bin = bin+ rem*place;
            place= place*10;
            n=n/2;
        }
        System.out.println("Binary : " +bin);
        sc.close();
    }
    
}
