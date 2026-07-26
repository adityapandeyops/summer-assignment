package Day20;
import java.util.*;
// Write a program to Find column-wise sum. 
public class q4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n= sc.nextInt();
        int[][] a= new int[n][n];
        System.out.println("Enter the matrix: ");
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Column-wise sum: ");
        for(int j=0;j<n; j++){
            int sum=0;
            for(int i=0; i<n; i++){
                sum= sum+a[i][j];
            }
            System.out.println("Sum o column" + (j + 1) + " = " +sum);
        }
        sc.close();
    }
    
}
