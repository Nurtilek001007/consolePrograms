/* 03.04.2024 - 03.04.2024
https://leetcode.com/problems/removing-stars-from-a-string/
 */
package leetcode.leetcode75.stack;

import java.util.Stack;

public class RemovingStarsFromAString2390 {
    public static void main(String[] args) {
        RemovingStarsFromAString2390 string = new RemovingStarsFromAString2390();
        String s = "leet**cod*e";
        System.out.println(string.removeStars(s));
    }

    public String removeStars(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c != '*') {
                stack.push(c);
            } else stack.pop();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stack.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
