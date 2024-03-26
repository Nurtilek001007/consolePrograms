/* 06.03.2024 - 06.03.2024
https://leetcode.com/problems/can-place-flowers/description/
 */
package leetcode.leetcode75.array_string;

public class CanPlaceFlowers605 {
    public static void main(String[] args) {
        int[] flowers = {1};
        int num = 1;
        CanPlaceFlowers605 place = new CanPlaceFlowers605();
        System.out.println(place.canPlaceFlowers(flowers, num));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            return flowerbed[0] + n != 2;
        } else {
            if (flowerbed[0] + flowerbed[1] == 2 || flowerbed[flowerbed.length - 1] + flowerbed[flowerbed.length - 2] == 2)
                return false;
            if (flowerbed[0] + flowerbed[1] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            if (flowerbed[flowerbed.length - 1] + flowerbed[flowerbed.length - 2] == 0) {
                flowerbed[flowerbed.length - 1] = 1;
                n--;
            }
            for (int i = 1; i < flowerbed.length - 1; i++) {
                if (flowerbed[i] + flowerbed[i + 1] == 2) return false;
                if (flowerbed[i - 1] + flowerbed[i] + flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }
}
