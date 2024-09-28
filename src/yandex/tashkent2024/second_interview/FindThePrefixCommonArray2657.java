// leetcode 2657
package yandex.tashkent2024.second_interview;

import java.util.Arrays;

public class FindThePrefixCommonArray2657 {
    public static void main(String[] args) {
        FindThePrefixCommonArray2657 prefixTwoArrays = new FindThePrefixCommonArray2657();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 1, 2};
        System.out.println(Arrays.toString(prefixTwoArrays.findThePrefixCommonArray(arr1, arr2)));
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int cnt = 0;
        int[] res = new int[n];
        int[] countA = new int[n + 1];
        int[] countB = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int j = A[i];
            int k = B[i];
            countA[j]++;
            countB[k]++;
            if (countA[j] == 1 && countB[j] == 1) {
                cnt++;
            }
            if (j != k && countA[k] == 1 && countB[k] == 1) {
                cnt++;
            }
            res[i] = cnt;
        }
        return res;
    }
}
