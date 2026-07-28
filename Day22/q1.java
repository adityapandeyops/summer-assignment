package Day22;
import java.util.*;
// Write a program to Check palindrome string.
public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    

        System.out.print("Enter a string: ");
        String str = sc.next();

        int i;
        int len = str.length();
        boolean isPalindrome = true;

        for (i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");

        sc.close();
    

    }
    
}
