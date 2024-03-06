/* 16.02.2024 - 06.03.2024
https://leetcode.com/problems/container-with-most-water/description/ */
package leetcode.leetcode75.two_pointers;
public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        ContainerWithMostWater11 container = new ContainerWithMostWater11();
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(container.maxArea(array));
    }

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int current = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, current);
            if (height[left] < height[right]) {
                left++;
            } else right--;
        }
        return max;
    }
}
