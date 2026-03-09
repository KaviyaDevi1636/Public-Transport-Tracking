import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TrackingSystem system = new TrackingSystem();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Public Transport Tracking System ---");
            System.out.println("1. View All Buses");
            System.out.println("2. Track Bus by Number");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    system.showAllBuses();
                    break;

                case 2:
                    System.out.print("Enter Bus Number: ");
                    String busNo = sc.next();
                    system.trackBus(busNo);
                    break;

                case 3:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 3);

        sc.close();
    }
}
