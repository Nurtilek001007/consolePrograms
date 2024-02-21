/*  04.01.2024 - 04.01.2024 */
package kata;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите через пробел, пример: 1 + 2: ");
            String s = sc.nextLine();
            System.out.println(calc(s));
            if (s.contentEquals("exit")) break;
        }
    }

    /**
     * Этот метод реализует основную логику задания. Надеюсь выполняет все требования.
     */
    public static String calc(String input) throws Exception {
        // Объявление необходимых переменных
        String operation;
        int[] numbers = new int[2];
        int answer;

        // Можно было создать класс Enum, но я решил, что так будет проще
        String[] arab = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rome = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] operations = new String[]{"+", "-", "*", "/"};

        // счетчики необходимы для требования №1, №2, №5, №7
        int romeQuantity = 0;
        int arabQuantity = 0;

        // Разделение строки чтобы получить числа и арифметическую операцию через пробел
        String[] parts = input.split(" ");

        // Сразу получаем символ арифметической операций в виде строки
        operation = parts[1];

        // Получаем 2 цифры в виде int из строки. Требования №4.
        for (String s : parts) {
            for (int i = 0; i < 10; i++) {
                if (s.contentEquals(rome[i])) {
                    numbers[romeQuantity] = i + 1;
                    romeQuantity++;
                } else if (s.contentEquals(arab[i])) {
                    numbers[arabQuantity] = i + 1;
                    arabQuantity++;
                }
            }
        }

        // Используя счетчики проверяем не смешались ли арабские цифры с римскими. Требования: №5.
        if (!(romeQuantity == 2 ^ arabQuantity == 2)) {
            throw new Exception();
        }

        // Введенные цифры должны быть от 1 до 10 включительно. Требования: №3, №7.
        if (!(numbers[0] >= 1 && numbers[0] <= 10 && numbers[1] >= 1 && numbers[1] <= 10)) {
            throw new Exception();
        }

        // Проверяем соответствие арифметических операций с помощью счетчика, сравнивая его с массивом "operations". Требования: №8.
        int C = 0; // Cчетчик, в честь языка программирования С++. (немного болтовни)
        for (int i = 0; i < 4; i++) {
            if (operation.contentEquals(operations[i])) {
                C++;
            }
        }
        if (C == 0) {
            throw new Exception();
        }

        // Производим арифметическую операцию используя метод "getAnswer".
        answer = getAnswer(numbers, operation);

        // Проверяем корректность на однообразие системы счисления. Требования №5.
        if (arabQuantity == 2 && romeQuantity == 0) {
            return Integer.toString(answer);
        } else if (arabQuantity == 0 && romeQuantity == 2) {
            return arabicToRoman(answer);
        }

        // Значение по умолчанию в случае некорректного выполнения задания.
        return "Спасибо за старание, но вы не прошли отбор";
    }

    /**
     * Этот метод возвращает результат в виде значения арифметической операции между двумя числами.
     */
    public static int getAnswer(int[] numbers, String operation) {
        int answer = 0;
        switch (operation) {
            case "+":
                answer = numbers[0] + numbers[1];
                break;
            case "-":
                answer = numbers[0] - numbers[1];
                break;
            case "*":
                answer = numbers[0] * numbers[1];
                break;
            case "/":
                answer = numbers[0] / numbers[1];
                break;
        }
        return answer;
    }

    /**
     * Этот метод возвращает строковое значение римской цифры, используя класс Enum kata.RomanNumeral.
     */
    public static String arabicToRoman(int number) {
        if (number < 1) {
            throw new IllegalArgumentException(number + " is not in range (1, 100)");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}