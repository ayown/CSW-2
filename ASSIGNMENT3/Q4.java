package ASSIGNMENT3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number to find its square root: ");
            int number = sc.nextInt();

            if (number < 0) {
                throw new ArithmeticException("Cannot calculate the square root of a negative number.");
            }

            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + squareRoot);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}

