package JAVA1.src.Abstraction;

public class ShapeManagement {
    public static void main(String[] args) {
        Circle c=new Circle(2);
        Rectangle re=new Rectangle(2,5);
        System.out.println(c.calculateArea());
        System.out.println(re.calculateArea());
        c.displayDetails();
        re.displayDetails();
    }
}
