import java.util.ArrayList;
import java.util.Scanner;

class Bus {
    String busNumber;
    String route;
    String currentLocation;

    Bus(String busNumber, String route, String currentLocation) {
        this.busNumber = busNumber;
        this.route = route;
        this.currentLocation = currentLocation;
    }

    void display() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Route: " + route);
        System.out.println("Current Location: " + currentLocation);
        System.out.println("---------------------------");
    }
}

public class TransportTrackingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== PUBLIC TRANSPORT TRACKING SYSTEM =====");
            System.out.println("1. Add Bus");
            System.out.println("2. Update Bus Location");
            System.out.println("3. View All Buses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bus Number: ");
                    String number = sc.nextLine();

                    System.out.print("Enter Route: ");
                    String route = sc.nextLine();

                    System.out.print("Enter Current Location: ");
                    String location = sc.nextLine();

                    buses.add(new Bus(number, route, location));
                    System.out.println("Bus added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Bus Number to update: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (Bus b : buses) {
                        if (b.busNumber.equals(search)) {
                            System.out.print("Enter New Location: ");
                            b.currentLocation = sc.nextLine();
                            System.out.println("Location updated!");
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Bus not found!");
                    }
                    break;

                case 3:
                    if (buses.isEmpty()) {
                        System.out.println("No buses available.");
                    } else {
                        for (Bus b : buses) {
                            b.display();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
