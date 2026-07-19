package Day13;
import java.util.*;
// wap to count even and odd element
public class q4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();  
        int[] arr= new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        int even =0, odd=0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 ==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even element : " +even);
        System.out.println("Odd element : " +odd);
        sc.close();
      }
    
}
