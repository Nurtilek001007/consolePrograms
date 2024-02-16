import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество значений в массиве:");
        int count = scanner.nextInt();
        Integer[] numbersArray = new Integer[count];

        System.out.println("Введите " + count + " значений:");
        for (int i = 0; i < count; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        List<Integer> numbers = Arrays.asList(numbersArray);

        Map<Integer, Long> countMap = numbers.stream()
                .collect(Collectors.groupingBy(
                        n -> n,          // Функция для группировки
                        Collectors.counting())); // Функция для подсчета количества

        // Выводим количество уникальных значений в массиве (количество ключей в Map)
        System.out.println("Количество уникальных значений в массиве: " + countMap.size());

        // Преобразуем значения Map в массив, сортируем его по возрастанию
        Long[] valuesArray = countMap.values().stream().sorted().toArray(Long[]::new);

        // Выводим содержимое массива
        System.out.println("Отсортированный массив значений: " + Arrays.toString(valuesArray));

        scanner.close();
    }
}