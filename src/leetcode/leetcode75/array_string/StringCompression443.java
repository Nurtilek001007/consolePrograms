/* 07.03.2024 - 07.03.2024
https://leetcode.com/problems/string-compression/description */
package leetcode.leetcode75.array_string;

public class StringCompression443 {
    public static void main(String[] args) {
        StringCompression443 s = new StringCompression443();
        char [] chars = {'a','b','b','b'};
        System.out.println(s.compress(chars));
    }

    public int compress(char[] chars) {
        int ans = 0;
        for (int i = 0; i < chars.length;) {
            final char letter = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }
            chars[ans++] = letter;
            if (count > 1) {
                for (final char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }
}
