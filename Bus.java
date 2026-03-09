public class Bus {

    private String busNumber;
    private String route;
    private Location location;
    private String status;
    private int arrivalTime;

    public Bus(String busNumber, String route, Location location, String status, int arrivalTime) {
        this.busNumber = busNumber;
        this.route = route;
        this.location = location;
        this.status = status;
        this.arrivalTime = arrivalTime;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getRoute() {
        return route;
    }

    public Location getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }
}
