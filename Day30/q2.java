package Day30;
import java.util.*;
//Wap to create mini library system.
public class q2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C"};
        int choice;

        System.out.println("1. Show Books");
        System.out.println("2. Issue Book");
        System.out.print("Enter Choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Books Available:");
            for (int i = 0; i < books.length; i++) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        } else if (choice == 2) {
            System.out.print("Enter Book Number: ");
            int n = sc.nextInt();

            if (n >= 1 && n <= books.length) {
                System.out.println(books[n - 1] + " Issued Successfully.");
            } else {
                System.out.println("Invalid Book Number.");
            }
        } else {
            System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
    

