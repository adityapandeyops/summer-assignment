package Day3;

import java.util.*;

// Prime number
public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        // for (int i = 2; i <= n; i++) {
        //     if(i==n){
        //         System.out.println("Prime");
        //         break;
        //     }
        //     if (n % i == 0) {
        //         System.out.println("Not prime number");
        //         break;
        //     }
        // }

        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not prime number");
                flag = 2;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Prime");

        sc.close();
    }
}
