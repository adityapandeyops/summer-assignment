package Day3;
import java.util.*;
// Prime Number in a range 
public class q2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        for(int num =left; num<=right; num++){
            int flag = 0;
            for(int i = 2; i<num; i++){
                if(num%i==0){
                    flag = 1;
                    break;
                }
            }
            if(flag ==0){
                System.out.println(num);
            }
        }
            
    //     System.out.print("Enter the lower bound: ");
    //     int lower = sc.nextInt();
    //     System.out.print("Enter the upper bound: ");
    //     int upper = sc.nextInt();

    //     System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
    //     for (int i = lower; i <= upper; i++) {
    //         if (isPrime(i)) {
    //             System.out.print(i + " ");
    //         }
    //     }
    //     sc.close();
    // }

    // public static boolean isPrime(int n) {
    //     if (n <= 1) {
    //         return false;
    //     }
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    sc.close();
    }

    
}
