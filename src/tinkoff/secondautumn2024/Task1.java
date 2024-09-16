package tinkoff.secondautumn2024;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        List<Integer> result = parseRanges(input);
        for (int i: result) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> parseRanges(String input) {
        String[] parts = input.split(",");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            if (part.contains("-")) {
                String[] range = part.split("-");
                int start = Integer.parseInt(range[0]);
                int end = Integer.parseInt(range[1]);
                for (int i = start; i <= end; i++) {
                    numbers.add(i);
                }
            } else {
                numbers.add(Integer.parseInt(part));
            }
        }

        return numbers;
    }
}

