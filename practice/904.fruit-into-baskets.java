/*
 * @lc app=leetcode id=904 lang=java
 *
 * [904] Fruit Into Baskets
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        int count = 0;
        int start = 0;
        int total = 2;

        int[] basket = new int[fruits.length];

        if (fruits.length <= 2) {
            return fruits.length;
        }

        for (int i = 0; i < basket.length; i++) {
            basket[fruits[i]] += 1;
            if (basket[fruits[i]] == 1) {
                count++;
            }
            while (count > 2) {
                basket[fruits[start]]--;
                if (basket[fruits[start]] == 0) {
                    count--;
                }
                // total = i - start +1;
                start++;
            }
            total = Math.max(total, i - start + 1);
        }
        return total;
    }
}
// @lc code=end
