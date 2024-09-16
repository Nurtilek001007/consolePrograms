package tinkoff.secondautumn2024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int previous = Integer.MIN_VALUE;
        for (int i: arr) {
            if (i == -1) {
                continue;
            }
            if (i <= previous) {
                previous = -10;
                break;
            }
            previous = i;
        }
        if (previous == -10) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int i = 1; i <= arr.length; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
