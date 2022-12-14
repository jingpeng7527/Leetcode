/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int[] lds = new int[needle.length()];
        int prev = 0;
        int i = 1;
        lds[0] = prev;

        while (i < needle.length()) {
            if (needle.charAt(prev) == needle.charAt(i)) {
                lds[i] = prev + 1;
                prev++;
                i++;
            } else if (prev == 0) {
                lds[i] = 0;
                i++;
            } else {
                prev = lds[prev - 1];
            }
        }


        int k = 0;
        int j = 0;
        while (j < haystack.length()) {
            if (haystack.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
            } else if (k == 0) {
                j++;
            } else {
                k = lds[k - 1];
            }

            if (k == needle.length()) {
                return j - needle.length();
            }
        }

        return -1;
        // int slow = 0;
        // int fast = 0;
        // int index = 0;
        // int result = -1;

        // if (haystack.length() < needle.length()) {
        // return -1;
        // }

        // while (index < haystack.length()-needle.length()+1) {
        // slow = index;
        // fast = 0;
        // while (fast < needle.length()) {
        // if (haystack.charAt(slow) == needle.charAt(fast)) {
        // slow++;
        // fast++;
        // } else {
        // break;
        // }
        // // System.out.println(slow + " " + fast + " " + index);
        // }

        // if (slow - index == needle.length()) {
        // result = index;
        // break;
        // }
        // index++;
        // }

        // return result;

    }
}
// @lc code=end