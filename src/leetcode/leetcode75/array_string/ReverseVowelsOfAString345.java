/* 06.03.2024 - 06.03.2024
https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 */
package leetcode.leetcode75.array_string;

public class ReverseVowelsOfAString345 {
    public static void main(String[] args) {
        String string = "abababobo";
        ReverseVowelsOfAString345 r = new ReverseVowelsOfAString345();
        System.out.println(r.reverseVowels(string));
    }

    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        StringBuilder stringBuilder = new StringBuilder(s);
        String vowels = "aeoiuAEOIU";
        while (start < end) {
            while (start < end && vowels.indexOf(stringBuilder.charAt(start)) == -1) start++;
            while (start < end && vowels.indexOf(stringBuilder.charAt(end)) == -1) end--;

            char temp = stringBuilder.charAt(start);
            stringBuilder.setCharAt(start, stringBuilder.charAt(end));
            stringBuilder.setCharAt(end, temp);

            start++;
            end--;
        }
        return stringBuilder.toString();
    }
}
