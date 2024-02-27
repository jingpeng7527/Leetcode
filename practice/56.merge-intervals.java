/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] merge(int[][] intervals) {
        

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        int front = intervals[0][0];
        int back = intervals[0][1];
        
        int cur = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > back) {
                intervals[cur][0] = front;
                intervals[cur][1] = back;
                cur++;
                front = intervals[i][0];
                back = intervals[i][1];
            } else {
                back = Math.max(back, intervals[i][1]);
            }
        }
        intervals[cur][0] = front;
        intervals[cur][1] = back;

        // int[][] res = new int[cur+1][2];
        // for (int i = 0; i <= cur; i++) {
        //     res[i] = intervals[i];
        // }

        // return res;
        return Arrays.copyOf(intervals, cur + 1);
    }
}
// @lc code=end

