/*
 * @lc app=leetcode id=1217 lang=java
 *
 * [1217] Minimum Cost to Move Chips to The Same Position
 */

// @lc code=start
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for(int a: position){
            if(a%2==0){
                even++;
            }
        }
        return Math.min(even, position.length-even);
    }
}
// @lc code=end

