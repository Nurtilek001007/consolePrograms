package tinkoff.secondautumn2024;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int result = countCompositeNumbersWithPrimeDivisors(l, r);
        System.out.println(result);
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static int countCompositeNumbersWithPrimeDivisors(int l, int r) {
        boolean[] isPrime = sieveOfEratosthenes(r);
        int count = 0;

        for (int i = l; i <= r; i++) {
            if (!isPrime[i] && i > 1) {
                int divisorCount = countDivisors(i);
                if (isPrime[divisorCount]) {
                    count++;
                }
            }
        }

        return count;
    }
}
