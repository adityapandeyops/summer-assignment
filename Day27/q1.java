package Day27;
import java.util.*;
// Wap to create student record management system.
public class q1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] roll = new int[10];
        String[] name = new String[10];
        int[] marks = new int[10];

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Roll: ");
            roll[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\nStudent Records");
        for (int i = 0; i < n; i++) {
            System.out.println(roll[i] + " " + name[i] + " " + marks[i]);
        }

        sc.close();
    }
}
    

