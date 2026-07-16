package Day11;
import java.util.*;
// Function to find maximum
public class q2 {
    public static int maximum(int a, int b){
        return (a>b)? a:b;
    }
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter first number : ");
      int a=sc.nextInt();
      System.out.print("Enter second number : ");
      int b=sc.nextInt();
      int max = maximum(a, b);
      System.out.println("Maximum : " +max);
      sc.close();
    }
    
}
