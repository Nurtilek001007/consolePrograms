/* 04.03.2024 - 09.03.2024
https://leetcode.com/problems/merge-strings-alternately/description/ */
package leetcode.leetcode75.array_string;

public class MergeStringsAlternately1768 {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "PQRBMW";
        MergeStringsAlternately1768 string = new MergeStringsAlternately1768();
        System.out.println(string.mergeAlternately(s1, s2));
    }
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder answer = new StringBuilder();
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) answer.append(word1.charAt(i));
            if (i < word2.length()) answer.append(word2.charAt(i));
            i++;
        }
        return answer.toString();
    }
}