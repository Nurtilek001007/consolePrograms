package tinkoff.autumn2024;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        Pattern pattern = Pattern.compile("\\d+");
        ArrayList<int[]> listOfIntArrays = new ArrayList<>();
        for (String str : strings) {
            Matcher matcher = pattern.matcher(str);
            ArrayList<Integer> tempNumbers = new ArrayList<>();
            while (matcher.find()) {
                tempNumbers.add(Integer.parseInt(matcher.group()));
            }
            listOfIntArrays.add(tempNumbers.stream().mapToInt(Integer::intValue).toArray());
        }
        int[][] array = listOfIntArrays.toArray(new int[listOfIntArrays.size()][]);

//        System.out.println("Найденные числа в виде вложенного массива:");
//        for (int[] ints : array) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        int counter = 0, result = 0;
        while (counter < n) {
            result++;
            for (int i = 0; i < array.length; i++) {
                if (array[i][0] == 0) counter++;
                else {
                    int count = 0;
                    for (int j = 1; j < array[i].length; j++) {
                        if (array[array[i][j] - 1][0] == 0) count++;
                    }
                    if (count == array[i][0]) array[i][0] = 0;
                }
            }
            if (counter == n) break;
            else counter = 0;
        }
        System.out.println(result);
    }
}
