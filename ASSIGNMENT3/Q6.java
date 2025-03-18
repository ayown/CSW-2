package ASSIGNMENT3;

import java.util.*;

public class Q6 {
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    public static int binarySearch(int[] arr, int target) {
        int index = Arrays.binarySearch(arr, target);
        return index;
    }

    public static void accessElement(int[] arr, int index) {
        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access index " + index + " which is out of bounds.");
        }
    }

    public static void printArray(int[] arr) {
        System.out.println("Current array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {34, 2, 56, 78, 12, 90, 15};

        printArray(arr);

        sortArray(arr);

        System.out.print("Enter a number to search for in the array: ");
        int target = scanner.nextInt();

        int searchResult = binarySearch(arr, target);
        if (searchResult >= 0) {
            System.out.println("Number " + target + " found at index " + searchResult);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }

        accessElement(arr, 2);
        accessElement(arr, 10);
        accessElement(arr, -1);

        accessElement(arr, 0);
        accessElement(arr, arr.length - 1);

        scanner.close();
    }
}
