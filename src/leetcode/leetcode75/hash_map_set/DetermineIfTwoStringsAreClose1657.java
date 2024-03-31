/* 01.04.2024 - 01.04.2024
https://leetcode.com/problems/determine-if-two-strings-are-close/
 */
package leetcode.leetcode75.hash_map_set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetermineIfTwoStringsAreClose1657 {
    public static void main(String[] args) {
        DetermineIfTwoStringsAreClose1657 close = new DetermineIfTwoStringsAreClose1657();
        String word1 = "dbbccc";
        String word2 = "bbcccd";
        System.out.println(close.closeStrings(word1, word2));
    }

    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char ch : word1.toCharArray()) freq1[ch - 'a']++;
        System.out.println(Arrays.toString(freq1));
        for (char ch : word2.toCharArray()) freq2[ch - 'a']++;
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean myCloseStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char w : word1.toCharArray()) {
            map1.put(w, map1.getOrDefault(w, 0) + 1);
        }
        for (char w : word2.toCharArray()) {
            map2.put(w, map2.getOrDefault(w, 0) + 1);
        }
        int c = 0;
        for (Character key : map1.keySet()) {
            for (Character key1 : map2.keySet()) {
                if (key == key1) {
                    c++;
                    break;
                }

            }
        }
        int counter = 0;
        for (Integer i : map1.values()) {
            for (Integer j : map2.values()) {
                if (i.equals(j)) {
                    counter++;
                    break;
                }
            }
        }
        return c == map1.keySet().size() && counter == map1.values().size();
    }
}
