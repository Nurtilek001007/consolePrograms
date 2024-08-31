package leetcode.nFactorial.stackAndQueue;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        String s = "[{(()()()()()()[{}])}]";
        ValidParentheses20 valid = new ValidParentheses20();
        System.out.println(valid.isValid(s));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
