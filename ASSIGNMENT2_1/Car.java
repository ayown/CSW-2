package ASSIGNMENT2_1;

public class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayCarDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public int compareTo(Car otherCar) {
        if (this.speed > otherCar.speed) {
            return 1;
        } else if (this.speed < otherCar.speed) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 150);
        Car car2 = new Car("BMW", "Black", 180);

        int comparisonResult = car1.compareTo(car2);

        if (comparisonResult > 0) {
            System.out.println("The car with the greater speed is:");
            car1.displayCarDetails();
        } else if (comparisonResult < 0) {
            System.out.println("The car with the greater speed is:");
            car2.displayCarDetails();
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}
