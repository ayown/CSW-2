package ASSIGNMENT3;

import java.util.Scanner;

public class Q3 {

    public static int convertStringToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid numeric value.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        int result = convertStringToInt(userInput);

        if (result != -1) {
            System.out.println("The converted number is: " + result);
        }

        scanner.close();
    }
}
