/*
 * @lc app=leetcode id=752 lang=java
 *
 * [752] Open the Lock
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        int res = 0;
        Set<String> deads = new HashSet<>();
        for (String s : deadends) {
            deads.add(s);
            if ("0000".equals(s)) {
                return -1;
            }
        }
        Set<String> visited = new HashSet<>();
        visited.add("0000");


        while (!queue.isEmpty()) {
            int sz = queue.size();
            System.out.println(res+"-----------");
            for (int i = 0; i < sz; i++) {
                String cur = queue.poll();
                if (cur.equals(target)) {
                    return res;
                }

                for (int j = 0; j < 4; j++) {
                    String plus1 = plusOne(cur, j);
                    if (!deads.contains(plus1) && visited.add(plus1)) {
                        queue.offer(plus1);
                        // System.out.println(plus1);
                    }
                    String minus1 = minusOne(cur, j);
                    if (!deads.contains(minus1) && visited.add(minus1)) {
                        queue.offer(minus1);
                        // System.out.println(minus1+"kk");

                    }
                }
            }
            res++;
        }

        return -1;
    }

    public String plusOne(String cur, int i) {
        char[] c = cur.toCharArray();
        if (c[i] == '9') {
            c[i] = '0';
        } else {
            c[i] += 1;
        }
        return new String(c);
    }

    public String minusOne(String cur, int i) {
        char[] c = cur.toCharArray();
        if (c[i] == '0') {
            c[i] = '9';
        } else {
            c[i] -= 1;
        }
        return new String(c);
    }
}
// @lc code=end
