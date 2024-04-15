/* 15.04.2024 - 15.04.2024 */
package tinkoff.summer2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String direction = scanner.next();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        List<String> operations = new ArrayList<>();
        int operationCount = 0;
        if (direction.equals("R")) {
            operationCount = rotateClockwise(matrix, n, operations);
        } else if (direction.equals("L")) {
            operationCount = rotateCounterclockwise(matrix, n, operations);
        }

        System.out.println(operationCount);

        for (String operation : operations) {
            System.out.println(operation);
        }
    }

    private static int rotateClockwise(int[][] matrix, int n, List<String> operations) {
        int operationCount = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;

                operations.add((i + 1) + " " + (j + 1) + " " + (n - j) + " " + (i + 1));
                operations.add((i + 1) + " " + (j + 1) + " " + (n - i) + " " + (n - j));
                operations.add((i + 1) + " " + (j + 1) + " " + (j + 1) + " " + (n - i));

                operationCount += 3;
            }
        }
        return operationCount;
    }

    private static int rotateCounterclockwise(int[][] matrix, int n, List<String> operations) {
        int operationCount = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = temp;

                operations.add((i + 1) + " " + (j + 1) + " " + (j + 1) + " " + (n - i));
                operations.add((i + 1) + " " + (j + 1) + " " + (n - i) + " " + (n - j));
                operations.add((i + 1) + " " + (j + 1) + " " + (n - j) + " " + (i + 1));

                operationCount += 3;
            }
        }
        return operationCount;
    }
}
