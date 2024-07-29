package tinkoff.autumn2024;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
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

        List<Set<Integer>> listOfSets = new ArrayList<>();
        int result = 0;
        while (n > 0) {
            result++;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i][0] == 0) {
                    n--;
                    set.add(i+1);
                    array[i][0] = -1;
                }
                else {
                    int count = 0;
                    for (int j = 1; j < array[i].length; j++) {
                        if (array[array[i][j] - 1][0] <= 0) count++;
                    }
                    if (count == array[i][0]) array[i][0] = 0;
                }
            }
            listOfSets.add(set);
        }
        System.out.println(result);
        for (Set<Integer> set : listOfSets) {
            System.out.println(set.size() + " " + set);
        }
    }
}
/*
1)
5
3 2 3 5
1 4
0
0
1 3

2)
6
1 2
1 3
1 4
1 5
1 6
0

3)
6
5 2 3 4 5 6
0
0
0
0
0

4)
3
0
0
0


*/
