package Day29;
import java.util.*;
// Wap to create menu-driven array operations system.
public class q2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int i, sum = 0;

        System.out.println("Enter 5 array elements:");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n1. Display");
        System.out.println("2. Sum");
        System.out.println("3. Largest");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Array Elements:");
                for (i = 0; i < 5; i++)
                    System.out.print(arr[i] + " ");
                break;

            case 2:
                for (i = 0; i < 5; i++)
                    sum += arr[i];
                System.out.println("Sum = " + sum);
                break;

            case 3:
                int max = arr[0];
                for (i = 1; i < 5; i++) {
                    if (arr[i] > max)
                        max = arr[i];
                }
                System.out.println("Largest = " + max);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
    

