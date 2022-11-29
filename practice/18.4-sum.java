import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int temp;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > 0 && nums[i] > target) {
                return list;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                // System.out.println("brak");
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) { // 对nums[j]去重
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                // System.out.println(i + ""+ j + ""+ left + ""+right);
                while (left < right) {
                    temp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (temp == target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[right] == nums[right - 1])
                            right--;
                        while (right > left && nums[left] == nums[left + 1])
                            left++;
                        right--;
                        left++;
                    } else if (temp < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return list;
    }
}
// @lc code=end
