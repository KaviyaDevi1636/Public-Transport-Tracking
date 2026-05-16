import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        TrackingSystem system = new TrackingSystem();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("\n--- Public Transport Tracking System ---");
            System.out.println("1. View All Buses");
            System.out.println("2. Track Bus by Number");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number (1-3).");
                sc.nextLine(); // clear the invalid input from scanner
                continue; // skip the rest of the loop and show the menu again
            }

            switch(choice) {

                case 1:
                    system.showAllBuses();
                    break;

                case 2:
                    System.out.print("Enter Bus Number (e.g. B101): ");
                    String busNo = sc.nextLine();
                    system.trackBus(busNo);
                    break;

                case 3:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }

        } while(choice != 3);

        sc.close();
    }
}
