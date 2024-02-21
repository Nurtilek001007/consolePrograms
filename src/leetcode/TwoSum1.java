/*  16.02.2024 - 16.02.2024 */
package leetcode;
import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 9, 6};
        int target = 15;
        TwoSum1 method = new TwoSum1();
        System.out.println(Arrays.toString(method.twoSum(array, target)));
    }

    public int[] twoSum(int[] num, int target) {
        int[] array = new int[2];
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }
}