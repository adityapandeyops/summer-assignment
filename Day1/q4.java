package Day1;

import java.util.*;
// count digit in a number
public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        while (n>0){
            n = n/10;
            count++;

        }
        System.out.println(count);
        sc.close();
    }
    
}
