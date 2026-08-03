package Day28;
import java.util.*;
// Wap to create ticket booking system.
public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seats = 10;

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= seats) {
            seats = seats - tickets;
            System.out.println("Ticket Booked Successfully.");
            System.out.println("Remaining Seats = " + seats);
        } else {
            System.out.println("Tickets Not Available.");
        }

        sc.close();
    }
}

