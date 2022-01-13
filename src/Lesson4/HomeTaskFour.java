package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeTaskFour {
    public static void main(String[] args) {
        int counter = 0;
        int maxCounter = 3;
        System.out.println("Hello!");
        System.out.println("Please input matrix size:");
        while (counter < maxCounter) {
            Scanner scanner = new Scanner(System.in);
            counter++;
            if (scanner.hasNextInt()) {
                int matrixSize = scanner.nextInt();
                int[][] matrix = new int[matrixSize][matrixSize];
                creatingMatrix(matrixSize, matrix);
                System.out.println("Original matrix:");
                printingMatrix(matrix);
                changingMatrixDiagonals(matrix);
                System.out.println("Changed matrix:");
                printingMatrix(matrix);
                break;
            } else {
                System.out.println("Wrong input!");
            }
        }
    }

    public static void printingMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] creatingMatrix(int matrixSize, int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }

    private static int[][] changingMatrixDiagonals(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int element = matrix[i][i];
            matrix[i][i] = matrix[i][matrix.length - 1 - i];
            matrix[i][matrix.length - 1 - i] = element;
        }
        return matrix;
    }
}
