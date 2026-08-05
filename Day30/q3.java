package Day30;
import java.util.*;
// Wap to create mini employee management system.
public class q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[3];
        String[] name = new String[3];

        // Input employee details
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details");
            System.out.print("ID: ");
            id[i] = sc.nextInt();

            System.out.print("Name: ");
            name[i] = sc.next();
        }

        // Display employee details
        System.out.println("\nEmployee Records");
        System.out.println("ID\tName");

        for (int i = 0; i < 3; i++) {
            System.out.println(id[i] + "\t" + name[i]);
        }

        sc.close();
    }
}
    

