/* 29.03.2024 - 29.03.2024
https://leetcode.com/problems/find-pivot-index/
 */
package leetcode.leetcode75.prefix_sum;

public class FindPivotIndex724 {
    public static void main(String[] args) {
        FindPivotIndex724 index = new FindPivotIndex724();
        int[] nums = {1, 20, 15};
        System.out.println(index.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
        int lsum = 0, total = 0;
        for (int num : nums) total = total + num;
        for (int i = 0; i < nums.length; i++) {
            if (lsum * 2 == total - nums[i]) return i;
            lsum += nums[i];
        }
        return -1;
    }

//    public int myPivotIndex(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int left = 0, leftSum = 0;
//            while (left < i) {
//                leftSum += nums[left];
//                left++;
//            }
//            int right = nums.length - 1, rightSum = 0;
//            while (right > i) {
//                rightSum += nums[right];
//                right--;
//            }
//            if (leftSum == rightSum) return i;
//        }
//        return -1;
//    }
}
