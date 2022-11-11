import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> list = new HashSet<>();
        for (int integer : nums1) {
            set.add(integer);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        int index = 0;
        for (int i : list) {
            result[index++] = i;
        }



        // int leng = Math.max(nums1.length, nums2.length);
        // int[] count = new int[1000];
        // int[] result = new int[1000];

        // for (int i = 0; i < nums1.length; i++) {
        //     count[nums1[i]]++;

        // }
        // for (int i = 0; i < nums2.length; i++) {
        //     count[nums2[i]]--;

        // }

        // for (int i : count) {
        //     if (i != 0) {
        //         result[i] = i;
        //     }
        // }
        return result;
    }
}
// @lc code=end

