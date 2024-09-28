package yandex.tashkent2024.first_interview;

import java.util.Arrays;

public class MinimumMultiplicationPairs {
    public static void main(String[] args) throws Exception {
        MinimumMultiplicationPairs minimumMultiplicationPairs = new MinimumMultiplicationPairs();
        int [] arr = {-10, -5, 0, 5, 10};
        // -2 -1 0 1 2  -> -4
        // 0 1 2 3 4    -> 0
        System.out.println(minimumMultiplicationPairs.minimumPairs(arr));
    }

    public int minimumPairs(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Array is empty!");
        }
        int res;
        Arrays.sort(arr);
        if (arr[0] < 0) {
            res = arr[0] * arr[arr.length - 1];
        } else {
            res = arr[0] * arr[1];
        }
        return res;
    }
}