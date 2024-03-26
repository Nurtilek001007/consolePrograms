/* 06.03.2024 - 06.03.2024
https://leetcode.com/problems/product-of-array-except-self/description/
 */
package leetcode.leetcode75.array_string;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        ProductOfArrayExceptSelf238 product = new ProductOfArrayExceptSelf238();
        System.out.println(Arrays.toString(product.productExceptSelf(array)));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
