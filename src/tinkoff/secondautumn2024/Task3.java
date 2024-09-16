package tinkoff.secondautumn2024;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainString = sc.next();
        String subString = sc.next();
        int outputLength = sc.nextInt();
        String result = findRightmostMatch(mainString, subString, outputLength);
        System.out.println(result);
    }

    public static String findRightmostMatch(String mainString, String subString, int outputLength) {
        int n = mainString.length();
        int lastMatch = -1;
        int subIndex = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (mainString.charAt(i) == subString.charAt(subIndex)) {
                subIndex++;
                if (subIndex == subString.length()) {
                    lastMatch = i;
                    break;
                }
            }
        }
        if (subIndex != subString.length()) {
            return "-1";
        }
        if (lastMatch + outputLength <= n) {
            return mainString.substring(lastMatch, lastMatch + outputLength);
        } else {
            return "-1";
        }
    }
}
