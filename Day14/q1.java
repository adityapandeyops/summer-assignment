package Day14;
import java.util.*;
// wap to linear search
public class q1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        // Input array element 
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        // input element to search
        System.out.println("Enter element to search : ");
        int key= sc.nextInt();
        int found=0;

        //Linear search
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                System.out.println("Element found at index :" +i);
                found =1;
                break;
            }
        }
        if(found==0){
            System.out.println("Element not found ");
        }
        sc.close();
    }

    
}
