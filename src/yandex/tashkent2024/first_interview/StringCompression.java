// leetcode 443 похожая задача
package yandex.tashkent2024.first_interview;

public class StringCompression {
    public static void main(String[] args) throws Exception {
        StringCompression str = new StringCompression();
        String s = "AAAABBBFFFDDDD";
        System.out.println(str.compress(s));
    }

    public String compress(String s) throws Exception {
        if (s.isEmpty()) {
            return "";
        }
        if (!s.matches("[A-Z]+")) {
            throw new Exception("String has another symbol from alphabet");
        }
        char c = s.charAt(0);
        int cnt = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (ch == c) {
                cnt++;
            } else {
                stringBuilder.append(c);
                stringBuilder.append(cnt);
                c = ch;
                cnt = 1;
            }
        }
        if (cnt > 1) {
            stringBuilder.append(c);
            stringBuilder.append(cnt);
        } else {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
