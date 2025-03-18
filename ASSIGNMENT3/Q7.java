package ASSIGNMENT3;

import java.util.Scanner;

public class Q7 {

    public static int[][] addMatrices(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("Error: Matrices dimensions must match for addition.");
            return null;
        }
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        if (A[0].length != B.length) {
            System.out.println("Error: Matrices cannot be multiplied.");
            return null;
        }
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static int[][] transposeMatrix(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[j][i] = A[i][j];
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row)
                System.out.print(elem + " ");
            System.out.println();
        }
    }

    public static void accessElement(int[][] matrix, int row, int col) {
        try {
            System.out.println("Element at (" + row + "," + col + "): " + matrix[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index (" + row + "," + col + ") is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows and columns for Matrix A: ");
        int rowsA = scanner.nextInt(), colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsA; j++)
                matrixA[i][j] = scanner.nextInt();

        System.out.print("Enter rows and columns for Matrix B: ");
        int rowsB = scanner.nextInt(), colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rowsB; i++)
            for (int j = 0; j < colsB; j++)
                matrixB[i][j] = scanner.nextInt();

        System.out.println("\nMatrix A + Matrix B:");
        int[][] sum = addMatrices(matrixA, matrixB);
        if (sum != null) printMatrix(sum);

        System.out.println("\nMatrix A * Matrix B:");
        int[][] product = multiplyMatrices(matrixA, matrixB);
        if (product != null) printMatrix(product);

        System.out.println("\nTranspose of Matrix A:");
        printMatrix(transposeMatrix(matrixA));

        accessElement(matrixA, 1, 2);
        accessElement(matrixA, 5, 5);

        scanner.close();
    }
}
