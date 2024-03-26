/* 18.03.2024 - 27.03.2024
https://leetcode.com/problems/maximum-average-subarray-i
 */
package leetcode.leetcode75.sliding_window;

public class MaximumAverageSubarrayI643 {
    public static void main(String[] args) {
        MaximumAverageSubarrayI643 i = new MaximumAverageSubarrayI643();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        System.out.println(i.findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int left = 0, right = k, max = sum;
        while (right < nums.length) {
            sum = sum - nums[left];
            left++;
            sum = sum + nums[right];
            right++;
            max = Math.max(max, sum);
        }
        return (double) max / k;
    }
}
