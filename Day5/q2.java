package Day5;
import java.util.*;
// Strong number 
public class q2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n, sum=0;
        while(n>0){
            int rem=n%10;
            int fact=1;
            for(int i=1; i<=rem; i++){
                fact= fact*i;
            }
                sum= sum+fact;
                n=n/10;
        }
        if(sum==temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not Strong number");
        }
        sc.close();
    }
    
}
