/* 29.03.2024 - 29.03.2024
https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element
Sliding window algorithm
 */
package leetcode.leetcode75.sliding_window;

public class LongestSubarrayof1sAfterDeletingOneElement1493 {
    public static void main(String[] args) {
        LongestSubarrayof1sAfterDeletingOneElement1493 element = new LongestSubarrayof1sAfterDeletingOneElement1493();
        int[] nums = {1, 1, 1, 1, 0, 1, 1};
        System.out.println(element.longestSubarray(nums));
    }

    public int longestSubarray(int[] nums) {
        int curr = 0, c = 0, max = 0;
        for (int num : nums) {
            if (num == 0) {
                curr = c;
                c = 0;
                continue;
            }
            c++;
            max = Math.max(max, curr + c);
        }
        if (max == nums.length) return nums.length - 1;
        else return max;
    }
}
