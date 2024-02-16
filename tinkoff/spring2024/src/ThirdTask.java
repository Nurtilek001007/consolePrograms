import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Заполняем данные: сначала количество массивов, потом сами массивы по 3 значения, разделяя " "
        int numArrays = scanner.nextInt();
        scanner.nextLine();
        int[][] arrays = new int[numArrays][];
        for (int i = 0; i < numArrays; i++) {
            String[] elements = scanner.nextLine().split(" ");
            int[] array = new int[3];
            for (int j = 0; j < 3; j++) {
                array[j] = Integer.parseInt(elements[j]);
            }
            arrays[i] = array;
        }

        /*
          Сортируем, сначала по последнему значению, потом по сумме первых значений
          Если последние цифры не равны, возвращаем результат сравнения последних цифр
          Если последние цифры равны, сравниваем суммы
         */
        Arrays.sort(arrays, Comparator.comparingInt((int[] a) -> a[2]).thenComparingInt(a -> a[0] + a[1]));

        /*
        // Вывод отсортированных массивов
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
        */

        // Проверяем условие для каждого массива, сумма первых значений должно быть больше третий
        boolean conditionMet = true;
        for (int[] array : arrays) {
            if (array[0] + array[1] > array[2]) {
                conditionMet = false;
                System.out.println("No");
                break;
            }
        }

        // Сумма первых значений предыдущего массива должно быть больше третьего значения текущего массива
        if (conditionMet) {
            int sum = arrays[0][0] + arrays[0][1]; // Суммируем первые два элемента первого массива

            for (int i = 0; i < numArrays; i++) {
                if (sum > arrays[i][2]) {
                    conditionMet = false;
                    System.out.println("No");
                    break; // Прерываем выполнение цикла, так как обнаружена ошибка
                }
                if (sum >= arrays[i][0] + arrays[i][1]) {
                    sum++;
                } else {
                    sum = arrays[i][0] + arrays[i][1];
                }
            }
        }

        // Если все условия выполнены выводим "Yes"
        if (conditionMet) {
            System.out.println("Yes");
        }
    }
}
