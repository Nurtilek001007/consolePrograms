/* 06.03.2024 - 06.03.2024
https://leetcode.com/problems/reverse-words-in-a-string/description/ */
package leetcode.leetcode75.array_string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAString151 {
    public static void main(String[] args) {
        String s = "    the    sky   is    blue       ";
        ReverseWordsInAString151 reverse = new ReverseWordsInAString151();
        System.out.println(reverse.reverseWords(s));
    }

    public String reverseWords(String s) {
        return Arrays.asList(s.split(" "))
                .reversed()
                .stream()
                .filter(e -> !e.isEmpty())
                .collect(Collectors.joining(" "));
    }
}
