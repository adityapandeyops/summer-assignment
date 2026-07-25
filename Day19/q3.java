package Day19;
import java.util.*;
// Write a program to Transpose matrix. 
public class q3 {
    public static void main(String args[]){
        System.out.print("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a= new int[n][n];
        System.out.println("Enter element of matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                a[i][j]=sc.nextInt();
            }
         }
               System.out.println("Transpose of matrix: ");
               for(int i=0; i<n;i++){
                for(int j=0; j<n; j++){
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
               }
               sc.close();

    }
    
}
