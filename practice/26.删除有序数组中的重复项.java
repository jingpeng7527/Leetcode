/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int flag = -1;//0没找到
        int last = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++)
                if (nums[j] == nums[i]) {
                    flag= j;
                    break;
                }

            if(flag==-1){
                nums[last] = nums[i];
                last++;
            }
            
            flag = -1;

        }

        return last;
        // last++;
    }
}
// @lc code=end
