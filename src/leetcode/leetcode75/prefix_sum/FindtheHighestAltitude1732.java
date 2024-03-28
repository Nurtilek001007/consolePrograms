/* 29.03.2024 - 29.03.2024
https://leetcode.com/problems/find-the-highest-altitude
 */
package leetcode.leetcode75.prefix_sum;

public class FindtheHighestAltitude1732 {
    public static void main(String[] args) {
        FindtheHighestAltitude1732 altitude = new FindtheHighestAltitude1732();
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(altitude.largestAltitude(gain));
    }
    public int largestAltitude(int[] gain) {
        int max = 0, sum = 0;
        for (int num: gain) {
            sum += num;
            max = Math.max(max, sum);
        }
        return max;
    }
}
