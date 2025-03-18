package ASSIGNMENT1;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setter(double length,double width) {
        this.length = length;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Q2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.setter(7.0,4.0);
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
    }
}

