package Day12;
import java.util.*;
// Write function for Perfect number
public class q4 {
    public static int perfect(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if(num==perfect(num)){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a Perfect number");
        }
        sc.close();
    }
    
    
}
