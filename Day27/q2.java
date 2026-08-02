package Day27;
import java.util.*;
// Wap to create employee management system.
public class q2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[10];
        String[] name = new String[10];
        double[] salary = new double[10];

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }

        System.out.println("\nEmployee Records");
        for (int i = 0; i < n; i++) {
            System.out.println(id[i] + " " + name[i] + " " + salary[i]);
        }

        sc.close();
    }
}
    

