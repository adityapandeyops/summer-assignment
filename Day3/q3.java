package Day3;
import java.util.*;
// GCD of two number
public class q3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        int gcd=1;
        for(int i=1; i<=a && i<=b;i++ ){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        sc.close();
    }

    
}
