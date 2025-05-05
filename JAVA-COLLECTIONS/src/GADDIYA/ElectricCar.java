package JAVA1.src.GADDIYA;

class ElectricCar extends Car {
    private int batteryCapacity; // in kWh
    private int rangePerCharge; // in kilometers

    public ElectricCar(String maker, String model, int numberOfDoors, String fuelType, int batteryCapacity, int rangePerCharge) {
        super(maker, model, numberOfDoors, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.rangePerCharge = rangePerCharge;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRangePerCharge() {
        return rangePerCharge;
    }

}
