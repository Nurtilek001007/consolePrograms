/* 28.03.2024 - 28.03.2024
https://leetcode.com/problems/max-consecutive-ones-iii
Sliding window algorithm. Задача:
Тут нужно подменить k-количество нулей на единицу и найти максимальную длину непрерывных единиц.
Подсказки:
1) Соответсвенно пока нулей меньше чем k мы просто ведем счетчик, мысленно подменяя все нули на единицу.
2) Но когда нулей становиться больше чем k, мы мысленно начинаем минусовать единицы сначала массива.
3) Если сначала встречается не единица, а ноль, мы мысленно минусуем единицу и минусуем счетчик нулей.
 */
package leetcode.leetcode75.sliding_window;

public class MaxConsecutiveOnesIII1004 {
    public static void main(String[] args) {
        MaxConsecutiveOnesIII1004 iii = new MaxConsecutiveOnesIII1004();
        int[] nums = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1};
        int k = 2;
        System.out.println(iii.longestOnes(nums, k));
    }

    public int longestOnes(int[] nums, int k) {
        int start = 0, end = 0, zeros = 0;
        while (end < nums.length) {
            if (nums[end] == 0) zeros++;
            end++;
            if (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
        }
        return end - start;
    }
}
