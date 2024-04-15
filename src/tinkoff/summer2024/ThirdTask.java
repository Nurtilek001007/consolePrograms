/* 15.04.2024 - 15.04.2024 */
package tinkoff.summer2024;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        // Сортируем массив
        Arrays.sort(strings);

        for (String path : strings) {
            String fileName = path.substring(path.lastIndexOf("/") + 1);
            int count = path.length() - path.replace("/", "").length();
            String result = "  ".repeat(count);
            System.out.println(result + fileName);
        }
    }
}
