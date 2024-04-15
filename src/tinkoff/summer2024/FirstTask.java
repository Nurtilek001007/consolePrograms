/* 15.04.2024 - 15.04.2024 */
package tinkoff.summer2024;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        System.out.println(firstTask.fives(m));
    }

    public int fives(int[] array) {
        if (array.length < 7) {
            return -1;
        }
        int result = 0, sum = 0, seven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 4) {
                result = 0;
                sum = 0;
                seven = 0;
            } else {
                if (seven < 7) {
                    seven++;
                    sum += array[i];
                    result = sum;
                } else {
                    sum += array[i] - array[i - 7];
                    if (sum > result) {
                        result = sum;
                    }
                }
            }
        }
        if (seven < 7) return -1;
        else {
            if (result / 7 == 5) return 7;
            else return result % 7;
        }
    }
}
