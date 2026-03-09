import java.util.ArrayList;

public class TrackingSystem {

    ArrayList<Bus> buses = new ArrayList<>();

    public TrackingSystem() {

        buses.add(new Bus("B101", "Central Bus Stand", new Location(10.92, 78.08), "On Time", 10));
        buses.add(new Bus("B102", "Railway Station", new Location(10.93, 78.10), "Delayed", 20));
        buses.add(new Bus("B103", "City Hospital", new Location(10.91, 78.06), "On Time", 5));
    }

    public void showAllBuses() {

        for(Bus bus : buses) {

            System.out.println("\nBus Number: " + bus.getBusNumber());
            System.out.println("Route: " + bus.getRoute());
            System.out.println("Status: " + bus.getStatus());
            System.out.println("Arrival Time: " + bus.getArrivalTime() + " minutes");
            System.out.println("Location: " + bus.getLocation().getLatitude() + ", "
                    + bus.getLocation().getLongitude());
        }
    }

    public void trackBus(String busNumber) {

        boolean found = false;

        for(Bus bus : buses) {

            if(bus.getBusNumber().equalsIgnoreCase(busNumber)) {

                System.out.println("\nBus Found!");
                System.out.println("Route: " + bus.getRoute());
                System.out.println("Status: " + bus.getStatus());
                System.out.println("Arrival Time: " + bus.getArrivalTime() + " minutes");
                System.out.println("Location: " + bus.getLocation().getLatitude() + ", "
                        + bus.getLocation().getLongitude());

                found = true;
            }
        }

        if(!found) {
            System.out.println("Bus not found");
        }
    }
}
