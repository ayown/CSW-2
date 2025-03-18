package JAVA_ERRORHANDLING;

public class Test8 {

    static class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }

    public static void checkIfOdd(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd, exception thrown.");
        }
        System.out.println("The number " + number + " is even.");
    }

    public static void main(String[] args) {
        try {
            checkIfOdd(3);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkIfOdd(4);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
