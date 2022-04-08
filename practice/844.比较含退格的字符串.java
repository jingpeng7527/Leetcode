/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }

    //     s = remove(s);
    //     System.out.println("s:" + s);
    //     t = remove(t);
    //     System.out.println("t:" + t);

    //     if (s.equals(t)) {
    //         return true;
    //     } else {
    //         return false;
    //     }

    // }

    // public String remove(String s) {
    //     int slow = 0, fast = 0;
    //     // int count = 0;
    //     // while (fast < s.length() - 1) {
    //     while (slow < s.length() - 1) {
    //         if (s.charAt(slow) != '#') {
    //             fast = slow + 1;
    //             if (s.charAt(fast) == '#') {
    //                 s = s.substring(0, slow) + s.substring(slow + 2);
    //                 if (slow > 0) {
    //                     slow--;
    //                 }
    //             } else {
    //                 slow++;
    //             }
    //         }

    //         else {
    //             slow++;
    //             s = s.substring(slow);
    //             slow = 0;
    //         }
    //         // System.out.println(s);
    //     }
    //     return s;
    // }

}
// @lc code=end
