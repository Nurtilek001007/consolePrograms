package xyz;

import java.util.Arrays;
import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String[] s = string.split("");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        PinCode pin = new PinCode();
        if (s.length == 4) System.out.println(pin.verifyPin4x(arr));
        else if (s.length == 6) System.out.println(pin.verifyPin6x(arr));
        else System.out.println("Введите 4 или 6 значений!");
    }

    public String verifyPin4x(int[] arr) {
        int n = 0;
        for (int j : arr) n += j;
        if (n == 1234 || n == 4321) return "Слабый пароль!";
        int counter = 0;
        Arrays.sort(arr);
        for (int i = 1; i < 4; i++) {
            if (arr[i] == arr[i - 1]) counter++;
        }
        if (counter > 1) return "Пароль должен составлять 3 разные цифры!";
        else return "Пароль сохранен!";
    }

    public String verifyPin6x(int[] arr) {
        int n = 0;
        for (int j : arr) n += j;
        if (n == 123456 || n == 654321 || n == 987654) return "Слабый пароль!";
        int counter = 0;
        Arrays.sort(arr);
        for (int i = 1; i < 6; i++) {
            if (arr[i] == arr[i-1]) counter++;
        }
        if (counter > 2) return "Пароль должен составлять 4 разные цифры!";
        else return "Пароль сохранен!";
    }
}