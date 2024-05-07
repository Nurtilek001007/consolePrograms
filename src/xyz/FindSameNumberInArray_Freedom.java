/*  09.02.2024 - 16.02.2024
    Вывести повторяющиеся значения из массива. Писал ручкой на бумаге, не сдал.
 */
package xyz;
import java.util.HashSet;

public class FindSameNumberInArray_Freedom {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 5, 3, 7, 8, 3};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
}
