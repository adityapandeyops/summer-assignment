package Day26;
import java.util.*;
// Wap to create quiz application.
public class q4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;

        System.out.println("===== Java Quiz =====");

        // Question 1
        System.out.println("\n1. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. static");
        System.out.println("4. void");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. init()");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Java is a:");
        System.out.println("1. Programming Language");
        System.out.println("2. Database");
        System.out.println("3. Operating System");
        System.out.println("4. Browser");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 1) {
            score++;
        }

        System.out.println("\n===== Result =====");
        System.out.println("Your Score: " + score + " out of 3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}
    

