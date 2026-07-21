package Day15;
import java.util.*;
// Write a program to Reverse array. 
public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed array : ");
        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]+ " ");
        }
        sc.close();
    }
    
}
