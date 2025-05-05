package JAVA1.src.GADDIYA;
// Base class
public class Vehicle {
    private String maker;
    private String model;

    public Vehicle(String maker, String model) {
        this.maker = maker;
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
