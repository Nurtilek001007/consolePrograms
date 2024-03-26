/* 09.03.2024 - 09.03.2024
https://leetcode.com/problems/is-subsequence/description/
*/
package leetcode.leetcode75.two_pointers;

public class IsSubsequence392 {
    public static void main(String[] args) {
        IsSubsequence392 is = new IsSubsequence392();
        String s1 = "abdc";
        String s2 = "ahbgcg";
        System.out.println(is.isSubsequence(s1, s2));
    }

    public boolean isSubsequence(String s, String t) {
        /*String result = t.replaceAll("[^" + s + "]", "");
        return result.equals(s);*/
        int c = 0;
        for (int i = 0; i < t.length() && c < s.length(); i++)
            if (t.charAt(i) == s.charAt(c)) c++;
        return c == s.length();
    }
}