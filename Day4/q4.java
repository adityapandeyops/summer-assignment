package Day4;
import java.util.*;
// TO print armstrong number in a range 
public class q4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();     //a=start;
        int b=sc.nextInt();    // b=end;
        for(int n=a; n<=b; n++){    //i=n
            int temp=n, sum=0, rem;      //temp=i
            while(temp>0){             // while(n>0)
                rem=temp%10;          
                sum = sum+(rem*rem*rem);
               temp= temp/10;           
            }
            if(sum==n){                 //sum==i==n
              System.out.print(n+ " ");    //i=n
            }

        }
         sc.close();
    }
    
}
