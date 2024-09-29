// leetcode 2657
package yandex.tashkent2024.second_interview;

import java.util.Arrays;

public class FindThePrefixCommonArray2657 {
    public static void main(String[] args) {
        FindThePrefixCommonArray2657 prefixTwoArrays = new FindThePrefixCommonArray2657();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 5, 4, 3, 2};
        System.out.println(Arrays.toString(prefixTwoArrays.findThePrefixCommonArray(arr1, arr2)));
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length, cnt = 0;
        int[] countA = new int [n + 1];
        int[] countB = new int [n + 1];
        int[] res = new int [n];
        for (int i = 0; i < n; i++) {
            int x = A[i];
            int y = B[i];
            countA[x]++;
            countB[y]++;
            if (countB[x] == 1) {
                cnt++;
            }
            if (countA[y] == 1 && x != y) {
                cnt++;
            }
            res[i] = cnt;
        }
        return res;
    }
}
