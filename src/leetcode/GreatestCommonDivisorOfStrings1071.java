package leetcode;

public class GreatestCommonDivisorOfStrings1071 {
    public static void main(String[] args) {
        String s1 = "ABCABCABC";
        String s2 = "ABCABC";
        GreatestCommonDivisorOfStrings1071 g = new GreatestCommonDivisorOfStrings1071();
        System.out.println(g.gcdOfStrings(s1, s2));
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int gcd = gcdLength(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcdLength (int str1, int str2) {
        return str2 == 0 ? str1 : gcdLength(str2, str1 % str2);
    }
}
