/*
 * @lc app=leetcode id=881 lang=java
 *
 * [881] Boats to Save People
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int res = 0;
        int left = 0, right = people.length - 1;
        
        Arrays.sort(people);

        while (left <= right) {
            if (people[left]+people[right]<=limit) {
                left++;
            }
            right--;
            res++;
        }
        return res;
    }
}
// @lc code=end

