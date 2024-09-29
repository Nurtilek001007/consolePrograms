// регулярные выражения. Regex. Classes Pattern, Matcher.
package yandex.tashkent2024.second_interview;

public class EmojiRemoval {
    public static String removeEmojis(String input) {
        return input.replaceAll("(:-?\\)+|:-?\\(+)", "");
    }

    public static void main(String[] args) {
        String example1 = "AAAadaw3213123:-32131!:-)";
        String example2 = ":-))))(())";

        System.out.println("Input: " + example1);
        System.out.println("Output: " + removeEmojis(example1));

        System.out.println("Input: " + example2);
        System.out.println("Output: " + removeEmojis(example2));
    }

}
