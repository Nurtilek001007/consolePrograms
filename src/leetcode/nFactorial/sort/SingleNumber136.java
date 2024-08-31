package leetcode.nFactorial.sort;

public class SingleNumber136 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 3, 4, 5};
        SingleNumber136 single = new SingleNumber136();
        System.out.println(single.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
