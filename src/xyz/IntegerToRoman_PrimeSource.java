/* 07.05.2024 - 07.05.2024
    Вывести от 1 до 50 чисел ввиде 1 - I, 2 - II... */
package xyz;

public class IntegerToRoman_PrimeSource {
    public static void main(String[] args) {
        String[] X = {"", "X", "XX", "XXX", "XL", "L"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 1; i <= 50; i++) System.out.println(i + " - " + X[i / 10] + I[i % 10]);
    }
}