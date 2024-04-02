/* 01.04.2024 - 03.04.2024
https://leetcode.com/problems/equal-row-and-column-pairs/
 */
package leetcode.leetcode75.hash_map_set;

import java.util.Arrays;

public class EqualRowAndColumnPairs2352 {
    public static void main(String[] args) {
        EqualRowAndColumnPairs2352 pairs = new EqualRowAndColumnPairs2352();
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(pairs.equalPairs(grid));
    }

    // Почему этот код, потому что он быстрее. По памяти проигрывает незначительно. Даже если 10 000 значений
    public int equalPairs(int[][] grid) {
        int pairs = 0, len = grid.length;
        for (int i = 0; i < len; i++) {
            int[] temp = new int[len];
            for (int j = 0; j < len; j++) {
                temp[j] = grid[j][i];
            }
            for (int[] ints : grid) {
                pairs += Arrays.equals(temp, ints) ? 1 : 0;
            }
        }
        return pairs;
    }

    public int myEqualPairs(int[][] grid) {
        /* Первый раз решил так: Сначала сравнил "+" в отдельном for, после в порядке "*", "#" в отдельном for уменьшая количество итераций.
        0       0000 +                                                      +[i][j] == [j][i]

        0 0     0000 0110 +         0001 0111 *                             +[i][j] == [j][i]
        0 1     1000 1110 *         1001 1111 +                             *[i+1][j] == [j][i] && [i][j] == [j][i+1]

        0 0 0   0000 0110 0220 +    0001 0111 0221 *    0002 0112 0222 #    +[i][j] == [j][i]
        0 1 1   1000 1110 1220 *    1001 1111 1221 +    1002 1112 1222 *    *[i+1][j] == [j][i] && [i][j] == [j][i+1]
        0 1 2   2000 2110 2220 #    2001 2111 2221 *    2002 2112 2222 +    #[i+2][j] == [j][i] && [i][j] == [j][i+2]

        ЕСЛИ НЕ ХОЧЕШЬ ЧИТАТЬ ВСЕ ЭТО, ПРОЧТИ ВОТ ЭТО:
        ПОСЛЕ ПОСМОТРЕЛ РЕШЕНИЕ НА LEETCODE И ОНО УДИВИЛО МЕНЯ: "ПРОСТО ПРОЙДИСЬ ПО ПОРЯДКУ".
        ТО ЕСТЬ КАК УКАЗАНО НИЖЕ:
        1 2 3
        4 5 6
        7 8 9
        И ЭТО ГЕНИАЛЬНО. ВЕДЬ РАЗМЕР МАТРИЦЫ НЕ ВАЖЕН. ОНА КВАДРАТНАЯ. ПРОСТО ИДИ ПО ПОРЯДКУ.
        0000 0110 0220      0001 0111 0221      0002 0112 0222
        1000 1110 1220      1001 1111 1221      1002 1112 1222
        2000 2110 2220      2001 2111 2221      2002 2112 2222

        Следующая матрица не нужна, но для наглядности оставил
        0 0 0 0     0000 0110 0220 0330 +    0001 0111 0221 0331 *    0002 0112 0222 0332 #    0003 0113 0223 0333 !    +[i][j] == [j][i]
        0 1 1 1     1000 1110 1220 1330 *    1001 1111 1221 1331 +    1002 1112 1222 1332 *    1003 1113 1223 1333 #    *[i+1][j] == [j][i] && [i][j] == [j][i+1]
        0 1 2 2     2000 2110 2220 2330 #    2001 2111 2221 2331 *    2002 2112 2222 2332 +    2003 2113 2223 2333 *    #[i+2][j] == [j][i] && [i][j] == [j][i+2]
        0 1 2 3     3000 3110 3220 3330 !    3001 3111 3221 3331 #    3002 3112 3222 3332 *    3003 3113 3223 3333 +    ![i+2][j] == [j][i] && [i][j] == [j][i+3]
         */
        /* // Первый раз
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            int count1 = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] != grid[j][i]) {
                    count1 = 0;
                    break;
                } else count1 = 1;
            }
            if (count1 == 1) result++;
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid.length - i; j++) {
                int count1 = 0, count2 = 0;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[j + i][k] == grid[k][j]) count1++;
                    if (grid[j][k] == grid[k][j + i]) count2++;
                }
                if (count1 == grid.length) result++;
                if (count2 == grid.length) result++;
            }
        }
        return result;*/
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int counter = 0;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[i][k] == grid[k][j]) {
                        counter++;
                    }
                }
                if (counter == grid.length) result++;
            }
        }
        return result;
    }
}
