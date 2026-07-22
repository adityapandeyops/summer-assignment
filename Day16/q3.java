package Day16;
import java.util.*;
// Write a program to Find pair with given sum.
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array :");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter array element: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter required sum : ");
        int sum=sc.nextInt();
        boolean found = false;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] ==sum){
                    System.out.println("Pair : " +arr[i] + " " +arr[j]);
                    found= true;
                }
            }
        }
        if(!found){
            System.out.println("No pair found ");
        }
        sc.close();
        

    }

    
}
