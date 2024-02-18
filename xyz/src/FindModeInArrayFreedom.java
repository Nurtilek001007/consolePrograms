// 9.02.2024 - 16.02.2024
/**
 * Вывести моду (часто встречаемое значение) из массива
 */
public class FindModeInArrayFreedom {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 5, 3, 7, 8, 3, 5, 3};
        int mode = 0, c = 0, index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            if (mode < c) {
                mode = c;
                index = arr[i];
            }
            c = 0;
        }
        System.out.println(index);
    }
}