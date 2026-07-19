package Day13;
import java.util.*;
// Wap to find sum and average of array
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        int sum =0;
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum = sum +arr[i];

        }
        double average = (double) sum/n;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        sc.close();
    }
    
}

