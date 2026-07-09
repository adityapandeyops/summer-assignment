package Day3;
import java.util.*;
// Prime number
public class q1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt() ;
        // System.out.print("Enter a number")
        // int n= sc.nextInt();
        // for(int i=2; i<=n/2; i++){
        //     if(n%i==0){
        //         System.out.println("Not Prime number");
        //     }
        //     else 
        //         System.out.println("Prime number");
            
        // }
        //  sc.close();
     for(int i=2; i<=n/2; i++){
        if(n%i==0){
            System.out.println("Not prime number");
            return;
        }
        else 
            System.out.println("prime number");
        return; 
    }
    sc.close();
}
}
