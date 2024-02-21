/*  09.02.2024 - 16.02.2024
    Вывести повторяющиеся значения из массива
 */
package xyz;
import java.util.HashSet;

public class FindSameNumberInArrayFreedom {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 5, 3, 7, 8, 3};
        HashSet set = new HashSet();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    set.add(arr[i]);
                }
            }
        }
        System.out.println(set);
    }
}
