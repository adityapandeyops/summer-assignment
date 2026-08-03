package Day28;
import java.util.*;
//Wap to create library management system.
public class q1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookName;
        int choice;

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        do {
            System.out.println("\n1. Display Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Book Name: " + bookName);
            } else if (choice == 2) {
                System.out.println("Book Issued Successfully.");
            } else if (choice == 3) {
                System.out.println("Book Returned Successfully.");
            } else if (choice == 4) {
                System.out.println("Thank You!");
            } else {
                System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
    

