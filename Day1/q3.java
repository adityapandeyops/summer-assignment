package Day1;

import java.util.*;
// factorial of a number
public class q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac=1;
        for(int i=1; i<=n; i++){
             fac = i*fac;
             System.out.println(fac);
        }

    

    }
    

}
