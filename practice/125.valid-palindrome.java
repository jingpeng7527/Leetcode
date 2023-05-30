/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public boolean isPalindrome(String s) {
        int ss = s.length();
        int i = 0;
        int j = ss -1;
        while (i<j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (i < j) {

                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;


    // s = s.toLowerCase();
    //     List<Character> chars = new ArrayList<>();
       
    //     for (char c : s.toCharArray()) {
    //         if (Character.isLetterOrDigit(c)) {
    //             chars.add(c);
    //         }
    //     }

    //     if (chars.size()<2) {
    //         return true;
    //     }

    //     int i = 0;
    //     int j = chars.size() - 1;

        
    //     while (i < chars.size()&& j>0) {
    //         if (i <= j) {
    //             if (Objects.equals(chars.get(i), chars.get(j))) {
    //                 i++;
    //                 j--;
    //             } else {
    //                 return false;
    //             }
    //         } else {
    //             return true;
    //         }
    //     }
    //     return true;
    }
}
// @lc code=end

