/* 27.03.2024 - 27.03.2024
https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
Sliding window algorithm
 */
package leetcode.leetcode75.sliding_window;

public class MaximumNumberOfVowelsInASubstringOfGivenLength1456 {
    public static void main(String[] args) {
        MaximumNumberOfVowelsInASubstringOfGivenLength1456 number = new MaximumNumberOfVowelsInASubstringOfGivenLength1456();
        String s = "leetcode";
        int k = 3;
        System.out.println(number.maxVowels(s, k));
    }

    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int vowel = 0;
        for (int i = 0; i < k; i++)
            if (vowels.indexOf(s.charAt(i)) != -1) vowel++;
        int max = vowel;
        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) vowel++;
            if (vowels.indexOf(s.charAt(i - k)) != -1) vowel--;
            max = Math.max(max, vowel);
        }
        return max;
    }

    /*public int myMaxVowels(String s, int k) {
        String vowels = "aeiou";
        int c = 0, max = 0;
        for (int i = 0; i < s.length() - 3; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                for (int j = i; j < i + k; j++) {
                    if (vowels.indexOf(s.charAt(j)) != -1) c++;
                }
            }
            if (c > max) max = c;
            c = 0;
        }
        return max;
    }*/
}
