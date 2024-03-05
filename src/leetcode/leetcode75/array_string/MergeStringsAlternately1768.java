package leetcode.leetcode75.array_string;

import java.util.Scanner;

public class MergeStringsAlternately1768 {
    public static void main(String[] args) {
        MergeStringsAlternately1768 string = new MergeStringsAlternately1768();
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(string.mergeAlternately(s1, s2));
    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < word1.length() || index < word2.length()){
            if (index < word1.length()) result.append(word1.charAt(index));
            if (index < word2.length()) result.append(word2.charAt(index));
            index++;
        }
        return result.toString();
    }
}