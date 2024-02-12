/*
 * @lc app=leetcode id=1071 lang=java
 *
 * [1071] Greatest Common Divisor of Strings
 */

// @lc code=start
import java.util.Objects;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int reminer = m % n;
        while (reminer != 0) {
            m = n;
            n = reminer;
            reminer = m % n;
        }

        StringBuilder sb = new StringBuilder();
        String res = "";
        res = str1.substring(0, n);

        for (int i = 0; i < str1.length() / n; i++) {
            if (!str1.substring(i * n, (i + 1) * n).equals(res)) {
                return "";
            }
        }
        for (int i = 0; i < str2.length() / n; i++) {
            if (!str2.substring(i * n, (i + 1) * n).equals(res)) {
                return "";
            }
        }

        // for (int i = 0; i < str1.length() / n; i++) {
        //     sb.append(res);
        // }
        // if (!sb.toString().equals(str1)) {
        //     return "";
        // }

        // sb.setLength(0);

        // for (int i = 0; i < str2.length() / n; i++) {
        //     sb.append(res);
        // }

        // if (!sb.toString().equals(str2)) {
        //     return "";
        // }

        return res;

    }
}
// @lc code=end