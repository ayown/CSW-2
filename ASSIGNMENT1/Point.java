package ASSIGNMENT1;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point copy) {
        this.x = copy.x;
        this.y = copy.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void displayPoint() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}

class Q3{
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        point1.displayPoint();
        Point point2 = new Point(point1);
        point2.displayPoint();
        point1.setX(7);
        point1.setY(8);
        System.out.println("After modifying point1:");
        point1.displayPoint();
        point2.displayPoint();
    }
}

