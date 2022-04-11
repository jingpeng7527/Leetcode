/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        int start = 0;
        int count = 0;
        int total = 2;
        int[] basket = new int[fruits.length];

        if(fruits.length<=2){
            return fruits.length;
        }

        for (int i = 0; i < fruits.length; i++) {
            basket[fruits[i]] += 1;// 入篮
            if (basket[fruits[i]] == 1)
                count++;// 当篮中第一次放入这个水果时计数加一
            while (count > 2) {
                basket[fruits[start]]--;
                if (basket[fruits[start]] == 0)
                    count--;
                start++;
            }
            total = Math.max(total, i - start + 1);
        }

        
        return total;
    }
}
// @lc code=end
