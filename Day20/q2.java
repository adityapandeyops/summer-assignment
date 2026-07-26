package Day20;
import java.util.*;
// Write a program to Check symmetric matrix. 
public class q2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[][] a= new int[n][n];
        boolean symmetric=true;
        System.out.println("Enter the matrix: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                a[i][j]=sc.nextInt();

            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
             if(a[i][j] != a[j][i]){
                symmetric = false;
             }
            }
        }
        if(symmetric)
            System.out.println("Matrix is symmetric");
        else
            System.out.println("Matrix is not symmetric ");
        sc.close();
    }
    
}
