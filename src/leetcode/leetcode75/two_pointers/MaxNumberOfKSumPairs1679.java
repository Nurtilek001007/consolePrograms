package leetcode.leetcode75.two_pointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs1679 {
    public static void main(String[] args) {
        MaxNumberOfKSumPairs1679 pairs = new MaxNumberOfKSumPairs1679();
        int[] numbers = {1, 2, 2, 3, 4, 5, 7};
        int k = 6;
        System.out.println(pairs.maxOperations(numbers, k));
    }

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0, left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (k == sum) {
                c++;
                left++;
                right--;
            } else if (sum > k) right--;
            else left++;
        }
        return c;
    }
}
