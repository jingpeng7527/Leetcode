/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // int prev = -1;
        // int diff = 0;

        // for (int i = 0; i < flowerbed.length; i++) {
        //     if (flowerbed[i] == 1) {
        //         if (prev < 0) {
        //             diff += (i / 2);
        //         } else {
        //             diff += (i - prev) / 2 - 1;
        //         }
        //         prev = i;
        //     }
        // }
        
        // if (prev < 0) {
        //     diff += ((flowerbed.length-1) / 2) + 1;
        // } else {
        //     diff += (flowerbed.length -1 - prev) / 2;
        // }
        
        // return diff >= n;

        for (int i = 0, len = flowerbed.length; i < len && n > 0;) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else {
                i += 3;
            }
        }
        return n <= 0;

    }
}
// @lc code=end

