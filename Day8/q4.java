package Day8;

//  Repeated number pattern
public class q4 {
    public static void main(String args[]){
        
        int n=5;
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1;j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
        

    }
    
}
