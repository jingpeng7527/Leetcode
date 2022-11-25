import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int temp;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // System.out.println(i);
            if (nums[i] > 0) {
                return list;
            }

            // skip the repeated one
            if (i>0&&nums[i] == nums[i- 1]) {
                // System.out.println("brak");
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                temp = nums[i] + nums[left] + nums[right];
                if (temp == 0) {
                    // List<Integer> list1 = new ArrayList<>();
                    // list1.add(nums[i]);
                    // list1.add(nums[left]);
                    // list1.add(nums[right]);
                    // list.add(list1);
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (right > left && nums[right] == nums[right - 1])
                        right--;
                    while (right > left && nums[left] == nums[left + 1])
                        left++;

                    right--;
                    left++;
                    // break;
                } else if (temp < 0) {
                    left++;
                } else {
                    right--;
                }
                // System.out.println(i + "" + left + "" + right);
            }
        }

        return list;
    }
}
// @lc code=end
