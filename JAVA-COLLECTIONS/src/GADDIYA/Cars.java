package JAVA1.src.GADDIYA;

class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String maker, String model, int numberOfDoors, String fuelType) {
        super(maker, model);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

}
