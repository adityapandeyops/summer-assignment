package Day29;
import java.util.*;
// Wap to create menu-driven string operations system.
public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("1. Length");
        System.out.println("2. Uppercase");
        System.out.println("3. Lowercase");
        System.out.println("4. Reverse");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Length = " + str.length());
                break;

            case 2:
                System.out.println("Uppercase = " + str.toUpperCase());
                break;

            case 3:
                System.out.println("Lowercase = " + str.toLowerCase());
                break;

            case 4:
                String rev = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev += str.charAt(i);
                }
                System.out.println("Reverse = " + rev);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
    

