package Day30;
import java.util.*;
// Wap to create student record system using arrays and strings.
public class q1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        int[] roll = new int[n];
        String[] name = new String[n];
        double[] marks = new double[n];

        // Input student records
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            roll[i] = sc.nextInt();

            System.out.print("Name: ");
            name[i] = sc.next();

            System.out.print("Marks: ");
            marks[i] = sc.nextDouble();
        }

        // Display student records
        System.out.println("\n----- Student Records -----");
        System.out.println("Roll No\tName\tMarks");

        for (int i = 0; i < n; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
        }

        sc.close();
    }
}
    

