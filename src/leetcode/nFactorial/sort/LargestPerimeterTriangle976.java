package leetcode.nFactorial.sort;

public class LargestPerimeterTriangle976 {
    public static void main(String[] args) {
        LargestPerimeterTriangle976 perimeter = new LargestPerimeterTriangle976();
        int[] nums = {1, 1, 1,1,1,1,2,2,10};
        System.out.println(perimeter.largestPerimeter(nums));
    }

    public int largestPerimeter(int[] nums) {
        for (int i = 0; i < 2; i++) {
            int maxInd = i;
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] > nums[maxInd])
                    maxInd = j;
            int temp = nums[maxInd];
            nums[maxInd] = nums[i];
            nums[i] = temp;
        }
        for (int i = 2; i < nums.length; i++) {
            int maxInd = i;
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] > nums[maxInd])
                    maxInd = j;
            int temp = nums[maxInd];
            nums[maxInd] = nums[i];
            nums[i] = temp;
            if (nums[i - 2] < nums[i - 1] + nums[i])
                return nums[i - 2] + nums[i - 1] + nums[i];
        }
        return 0;
    }
}
