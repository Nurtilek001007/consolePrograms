package leetcode.nFactorial.sort;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        MergeSortedArray88 mergeArray = new MergeSortedArray88();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 4, 5};
        int m = 3, n = 3;
        mergeArray.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // pointer for nums1
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for the merged array (nums1)

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, place them in nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
