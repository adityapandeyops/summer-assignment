package Day15;
import java.util.*;
// Write a program to Move zeroes to end. 
public class q4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element : ");
        for(int i=0; i<n; i++){
           arr[i]  =sc.nextInt();
        }
        int j=0;
        // Move non-zero elements to the front
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        // Fill remaining positions with 0
        while(j<n){
            arr[j]=0;
            j++;
        }
        System.out.println("Array after moving zeroes to end : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}

    

