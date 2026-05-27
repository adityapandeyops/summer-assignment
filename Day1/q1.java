package Day1;

import java.util.Scanner;

//Calculate Sum of first n natural numbers
public class q1 {
    public static void main(String args[]){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:");
        n= in.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of first N Natural Numbers: "+sum);
        in.close();
    }
}
