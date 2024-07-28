package tinkoff.autumn2024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long halfQuantity = (n - 99) / 2, mid = (100 + n), result;
        if (n % 2 == 1) {
            result = halfQuantity * mid;
        } else {
            result = halfQuantity * mid + mid / 2;
        }
        System.out.println(result);
    }
}
