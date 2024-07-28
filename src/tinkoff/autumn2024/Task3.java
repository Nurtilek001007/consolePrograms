package tinkoff.autumn2024;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int[] rowSums = new int[n];
        int[] colSums = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = scanner.nextInt();
                matrix[i][j] = value;
                rowSums[i] += value;
                colSums[j] += value;
            }
        }
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(rowSums[i] - colSums[j]) <= matrix[i][j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
