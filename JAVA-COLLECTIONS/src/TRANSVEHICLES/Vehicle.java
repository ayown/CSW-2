package JAVA1.src.TRANSVEHICLES;

class Vehicle {
    private String vehicleId;
    private int capacity;
    private String route;

    public Vehicle(String vehicleId, int capacity, String route) {
        this.vehicleId = vehicleId;
        this.capacity = capacity;
        this.route = route;
    }

    public String getVehicleId() { return vehicleId; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}

class Trucks extends Vehicle {
    private int numberOfAxles;
    private boolean refrigerated;

    public Trucks(String vehicleId, int capacity, String route, int numberOfAxles, boolean refrigerated) {
        super(vehicleId, capacity, route);
        this.numberOfAxles = numberOfAxles;
        this.refrigerated = refrigerated;
    }

}

class Ships extends Vehicle {
    private double deckSize;
    private int sailingRange;

    public Ships(String vehicleId, int capacity, String route, double deckSize, int sailingRange) {
        super(vehicleId, capacity, route);
        this.deckSize = deckSize;
        this.sailingRange = sailingRange;
    }

    public int getSailingRange() { return sailingRange; }

}

class Airplanes extends Vehicle {
    private int maxAltitude;
    private String engineType;

    public Airplanes(String vehicleId, int capacity, String route, int maxAltitude, String engineType) {
        super(vehicleId, capacity, route);
        this.maxAltitude = maxAltitude;
        this.engineType = engineType;
    }
    public int getMaxAltitude() { return maxAltitude; }

}

class MiniTrucks extends Trucks {
    private int payloadCapacity;
    private double fuelEfficiency;

    public MiniTrucks(String vehicleId, int capacity, String route, int numberOfAxles, boolean refrigerated, int payloadCapacity, double fuelEfficiency) {
        super(vehicleId, capacity, route, numberOfAxles, refrigerated);
        this.payloadCapacity = payloadCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

}


class Main {
    public static void main(String[] args) {
        MiniTrucks miniTruck = new MiniTrucks("MT123", 2000, "MUM --> DELHI", 2, true, 1000, 12.5);
        Ships ship = new Ships("S456", 5000, "INDIA --> SPAIN", 250.5, 1500);
        Airplanes airplane = new Airplanes("A789", 150, "BANGALORE --> KOCHI", 35000, "Jet");

        System.out.println("About MiniTruck: " + miniTruck.getVehicleId());
        System.out.println("About Ship: " + ship.getVehicleId() + ", Sailing Range: " + ship.getSailingRange());
        System.out.println("About Airplane: " + airplane.getVehicleId() + ", Max Altitude: " + airplane.getMaxAltitude());

        // Modify values
        miniTruck.setCapacity(2500);
        System.out.println("Updated MiniTruck Capacity: " + miniTruck.getCapacity());
    }
}
