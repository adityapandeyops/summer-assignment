package Day22;
import java.util.*;
// Write a program to Count words in a sentence
public class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        str = str.trim(); // Remove leading and trailing spaces

        if (str.isEmpty()) {
            System.out.println("Number of words = 0");
        } else {
            String[] words = str.split("\\s+"); // Split by one or more spaces
            System.out.println("Number of words = " + words.length);
        }

        sc.close();
    }
}
    

