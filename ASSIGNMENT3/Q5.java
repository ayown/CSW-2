package ASSIGNMENT3;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            try {

                int number = Integer.parseInt(input);

                try {
                    int result = 10 / number;
                    System.out.println("10 divided by " + number + " is " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input, not a valid number.");
            }

        } finally {
            scanner.close();
        }
    }
}
