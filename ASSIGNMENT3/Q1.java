package ASSIGNMENT3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an alphanumeric character string: ");
        String input = sc.next();

        try {
            if (input == null || input.isEmpty()) {
                throw new NullPointerException("Input string is null or empty.");
            }

            StringBuilder numbers = new StringBuilder();
            for (char ch : input.toCharArray()) {
                if (Character.isDigit(ch)) {
                    numbers.append(ch);
                }
            }

            if (numbers.length() > 0) {
                System.out.println("Extracted numbers: " + numbers);
            } else {
                System.out.println("No numeric characters found.");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
