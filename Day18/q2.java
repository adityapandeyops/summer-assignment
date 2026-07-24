package Day18;
import java.util.*;
// Write a program to Selection sort. 
public class q2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter array element: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        // Selection sort
        for(int i=0; i<n-1; i++){
            int min =i;
            for(int j=i+1; j<n; j++ ){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
