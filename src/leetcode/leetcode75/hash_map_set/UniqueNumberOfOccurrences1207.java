/* 30.03.2024 - 30.03.2024
https://leetcode.com/problems/unique-number-of-occurrences/
 */
package leetcode.leetcode75.hash_map_set;

import java.util.*;

public class UniqueNumberOfOccurrences1207 {
    public static void main(String[] args) {
        UniqueNumberOfOccurrences1207 occ = new UniqueNumberOfOccurrences1207();
        int[] arr = {1, 1, 1, 3, 6, 6, 6};
        System.out.println(occ.uniqueOccurrences(arr));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        return new HashSet<>(map.values()).size() == map.size();
    }
}
