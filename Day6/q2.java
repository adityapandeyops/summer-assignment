package Day6;
import java.util.*;
// Binary to Decimal
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int bin=sc.nextInt();
        int dec=0 , base=1;
        while(bin>0){
            int rem= bin%10;
            dec = dec+rem*base;
            base = base*2;
            bin= bin/10;

        }
        System.out.println("Decimal : " +dec);
        sc.close();
    }
    
}
