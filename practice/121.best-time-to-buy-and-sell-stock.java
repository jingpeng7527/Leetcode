/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==1) {
            return 0;
        }
        int min = prices[0];
        int profit = 0;

        for (int i : prices) {
            if (i < min) {
                min = i;
            }
            if (i - min >= profit) {
                profit = i - min;
            }
        }
        return profit;
    }
}
// @lc code=end

