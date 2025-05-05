@FunctionalInterface
interface Operation {
    double execute(double a, double b);
}

public class Q2 {
    public static void main(String[] args) {
        Operation add = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> b != 0 ? a / b : 0;

        System.out.println("Add: " + add.execute(10, 5));
        System.out.println("Subtract: " + sub.execute(10, 5));
        System.out.println("Multiply: " + mul.execute(10, 5));
        System.out.println("Divide: " + div.execute(10, 5));
    }
}