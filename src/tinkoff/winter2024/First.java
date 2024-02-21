/*  21.02.2024 - 21.02.2024 */
package tinkoff.winter2024;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        String[] array = new String[quantity];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        for (String a : array) {
            if (tinkoff(a) == true) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static boolean tinkoff(String s) {
        int count = s.length() - s.replace(String.valueOf("F"), "").length();
        if (s.length() == 7 && count == 2 && s.contains("T") && s.contains("I") && s.contains("N")
                && s.contains("K") && s.contains("O") && s.contains("F")) {
            return true;
        }
        return false;
    }
}
