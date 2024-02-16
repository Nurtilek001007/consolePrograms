import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Заменяем все вхождения "code[digits]" на "???"
        String output = input.replaceAll("code\\d+", "???");

        System.out.println("Результат: " + output);
    }
}
