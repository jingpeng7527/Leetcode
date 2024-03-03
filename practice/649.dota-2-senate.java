/*
 * @lc app=leetcode id=649 lang=java
 *
 * [649] Dota2 Senate
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }
        
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int i = radiant.poll();
            int j = dire.poll();
            if (i < j) {
                radiant.add(i + senate.length());
            } else {
                dire.add(j + senate.length());
            }
        }

        return !radiant.isEmpty() ? "Radiant" : "Dire";

    }
}
// @lc code=end

