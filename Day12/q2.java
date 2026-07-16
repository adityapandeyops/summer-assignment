package Day12;
import java.util.*;
// write function for armstrong
public class q2 {
    public static int armstrong(int n){
        int sum=0;
        int temp = n;
        while(temp>0){
            int rem= temp%10;
            sum = sum +(rem*rem*rem);
            temp = temp/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num == armstrong(num)){
             System.out.println("Armtrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
        sc.close();
    }
    
}
