/* 04.04.2024 - 05.04.2024
https://leetcode.com/problems/asteroid-collision
asteroids[i] != 0
 */
package leetcode.leetcode75.stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision735 {
    public static void main(String[] args) {
        AsteroidCollision735 collision = new AsteroidCollision735();
        int[] asteroids = {1, -2, -2, -2};
        System.out.println(Arrays.toString(collision.asteroidCollision(asteroids)));
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || stack.peek() < 0) stack.push(asteroids[i]);
            else {
                if (asteroids[i] > 0) {
                    stack.push(asteroids[i]);
                    continue;
                }
                if (stack.peek() + asteroids[i] == 0) stack.pop();
                else if (stack.peek() + asteroids[i] < 0) {
                    stack.pop();
                    i = i - 1;
                }
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
