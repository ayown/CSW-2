package ASSIGNMENT3;

import java.util.*;

public class Q9 {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        try {
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        return value;
    }

    public static void main(String[] args) {
        int number = readInteger();
        System.out.println("You entered: " + number);
    }
}

