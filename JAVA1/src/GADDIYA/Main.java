package JAVA1.src.GADDIYA;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 4, "Electric", 75, 500);

        System.out.println("Maker: " + tesla.getMaker());
        System.out.println("Model: " + tesla.getModel());
        System.out.println("Number of Doors: " + tesla.getNumberOfDoors());
        System.out.println("Fuel Type: " + tesla.getFuelType());
        System.out.println("Battery Capacity: " + tesla.getBatteryCapacity() + " kWh");
        System.out.println("Range per Charge: " + tesla.getRangePerCharge() + " km");

        tesla.setModel("Model Y");
        tesla.setBatteryCapacity(82);

        System.out.println("\nUpdated Model: " + tesla.getModel());
        System.out.println("Updated Battery Capacity: " + tesla.getBatteryCapacity() + " kWh");
    }
}
