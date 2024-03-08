/* 09.03.2024 - 09.03.2024
https://leetcode.com/problems/move-zeroes/description/ */
package leetcode.leetcode75.two_pointers;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        MoveZeroes283 move = new MoveZeroes283();
        int[] array = {0, 1, 0, 3, 12};
        move.moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }

    public void moveZeroes(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c++;
            } else if (c > 0) {
                int temp = nums[i];
                nums[i] = nums[i - c];
                nums[i - c] = temp;
            }
        }
    }
}
