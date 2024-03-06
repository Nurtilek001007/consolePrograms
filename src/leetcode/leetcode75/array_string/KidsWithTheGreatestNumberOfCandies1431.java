/* 05.03.2024 - 06.03.2024
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/ */
package leetcode.leetcode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 4, 1, 3};
        int extracandies = 3;
        KidsWithTheGreatestNumberOfCandies1431 k = new KidsWithTheGreatestNumberOfCandies1431();
        System.out.println(k.kidsWithCandies(candies, extracandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> bools = new ArrayList<>();
        for (int candy : candies) max = Math.max(candy, max);
        for (int candy : candies) {
            if (candy + extraCandies >= max) bools.add(true);
            else bools.add(false);
        }
        return bools;
    }
}
