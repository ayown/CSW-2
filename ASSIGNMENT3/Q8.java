package ASSIGNMENT3;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Q8 {

    public static void performOperation(int value) throws CustomCheckedException {
        if (value < 0) {
            throw new CustomCheckedException("Negative value is not allowed");
        }
        System.out.println("Operation performed with value: " + value);
    }

    public static void main(String[] args) {
        try {
            performOperation(-5);
        } catch (CustomCheckedException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

