package Day30;
import java.util.*;
// Wap to develop complete mini project using arrays, strings and function.
public class q4 {
    

    static int[] roll = new int[5];
    static String[] name = new String[5];
    static int[] marks = new int[5];

    static void addStudent() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Student " + (i + 1) + " Details");
            System.out.print("Roll No: ");
            roll[i] = sc.nextInt();

            System.out.print("Name: ");
            name[i] = sc.next();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
        }
    }

    static void displayStudent() {
        System.out.println("\nStudent Records");
        System.out.println("Roll\tName\tMarks");

        for (int i = 0; i < 5; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Students");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudent();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 3);

        sc.close();
    }
}
    

