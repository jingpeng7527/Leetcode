/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int front = 0;
        int back = s.length() - 1;
        char[] tmp = s.toCharArray();
        while (front < back ) {
            // System.out.println(front+" "+back);
            while (!isVowel(s.charAt(front)) && front < back) {
                front++;
                // System.out.println(front+"sss");
            }
            while (!isVowel(s.charAt(back)) && back>0) {
                back--;
                // System.out.println(back+"sssfwfs");

            }
            if (front < back) {
                char cur = tmp[front];
                tmp[front] = tmp[back];
                tmp[back] = cur;
                front++;
                back--;
            }
        }
        return new String(tmp);

    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
}

// @lc code=end

