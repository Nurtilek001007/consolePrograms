/* 07.03.2024 - 07.03.2024
https://leetcode.com/problems/increasing-triplet-subsequence/description */
package leetcode.leetcode75.array_string;

public class IncreasingTripletSubsequence334 {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 4, 5};
        IncreasingTripletSubsequence334 increase = new IncreasingTripletSubsequence334();
        System.out.println(increase.increasingTriplet(array));
    }

    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= a) a = num;
            else if (num <= b) b = num;
            else return true;
        }
        return false;
    }
}
