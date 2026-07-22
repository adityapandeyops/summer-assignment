package Day16;
import java.util.*;
// Write a program to Find missing number in array. 
public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        int[] arr= new int[size];
        int sum=0;
        System.out.println("Enter array element : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
            sum = sum+arr[i];
        }
        int n = size+1;
        int total= n*(n+1)/2;
        int missing =total - sum;
        System.out.println("Missing number : " + missing);
        sc.close();


    }
    
}
