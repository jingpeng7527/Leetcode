import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int item = 0;
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {

            item = target - nums[i];
            if (map.get(item) != null) {
                res[0] = i;
                res[1] = map.get(item);
            } else {
                map.put(nums[i], i);
            }
        }

        // int slow = 0;
        // int fast = 1;
        // int[] res = new int[2];

        // while (slow < nums.length - 1) {
        // while (fast < nums.length) {
        // if (nums[slow] + nums[fast] != target) {
        // fast++;
        // } else {
        // res[0] = slow;
        // res[1] = fast;
        // break;
        // }

        // // System.out.println(slow+""+fast);
        // }
        // slow++;
        // fast = slow + 1;
        // }
        return res;
    }
}
// @lc code=end
