/* 29.03.2024 - 29.03.2024
https://leetcode.com/problems/find-the-difference-of-two-arrays/
 */
package leetcode.leetcode75.hash_map_set;

import java.util.*;

public class FindTheDifferenceOfTwoArrays2215 {
    public static void main(String[] args) {
        FindTheDifferenceOfTwoArrays2215 arrays = new FindTheDifferenceOfTwoArrays2215();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(arrays.findDifference(nums1, nums2));
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        for (int num: set1) if(!set2.contains(num)) list.get(0).add(num);
        for (int num: set2) if(!set1.contains(num)) list.get(1).add(num);

        return list;
    }
}
