package ASSIGNMENT3;

import java.util.Scanner;

public class abc {
    // Matrix addition
    public static int[][] addMatrices(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) {
            throw new ArrayIndexOutOfBoundsException("Matrix dimensions do not match for addition.");
        }
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Matrix multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        if (A[0].length != B.length) {
            throw new ArrayIndexOutOfBoundsException("Matrix dimensions incompatible for multiplication.");
        }
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Matrix transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Input matrices A and B
            System.out.print("Enter rows and columns for Matrix A: ");
            int rA = sc.nextInt(), cA = sc.nextInt();
            int[][] A = new int[rA][cA];
            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < rA; i++) {
                for (int j = 0; j < cA; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter rows and columns for Matrix B: ");
            int rB = sc.nextInt(), cB = sc.nextInt();
            int[][] B = new int[rB][cB];
            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < rB; i++) {
                for (int j = 0; j < cB; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Matrix addition
            try {
                System.out.println("\nMatrix A + Matrix B:");
                displayMatrix(addMatrices(A, B));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            // Matrix multiplication
            try {
                System.out.println("\nMatrix A * Matrix B:");
                displayMatrix(multiplyMatrices(A, B));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            // Matrix transpose
            System.out.println("\nTranspose of Matrix A:");
            displayMatrix(transposeMatrix(A));
            System.out.println("\nTranspose of Matrix B:");
            displayMatrix(transposeMatrix(B));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
