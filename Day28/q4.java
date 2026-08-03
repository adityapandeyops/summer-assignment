package Day28;
import java.util.*;
// Wap to create contact management system.
public class q4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, phone;

        System.out.print("Enter Contact Name: ");
        name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.println("\nContact Saved Successfully!");
        System.out.println("Name : " + name);
        System.out.println("Phone: " + phone);

        sc.close();
    }
}
    

