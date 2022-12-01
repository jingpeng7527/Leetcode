import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = s.length() - 1;

        StringBuilder sb = space(s, start, end);
        // System.out.println(sb);
        reverse(sb, 0, sb.length() - 1);
        // System.out.println(sb);
        reverseseper(sb);
        // System.out.println(sb);
        return sb.toString();

        // s = s.trim();
        // List<String> wordList = Arrays.asList(s.split("\\s+"));
        // Collections.reverse(wordList);
        // return String.join(" ",wordList);

    }

    public StringBuilder space(String s, int start, int end) {
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        while (start <= end && s.charAt(end) == ' ') {
            end--;
        }
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            if (s.charAt(start) != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(s.charAt(start));
            }
            start++;
        }
        return sb;
    }

    public void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }

    public void reverseseper(StringBuilder sb) {
        int start = 0;
        int end = 1;
        while (start < sb.length()) {
            // while (end < sb.length()) {
            // if (sb.charAt(end) != ' ') {
            // end++;
            // } else {
            // break;
            // }
            while (end < sb.length() && sb.charAt(end) != ' ') {
                end++;
            }

            // System.out.println(end);
            reverse(sb, start, end - 1);

            start = end + 1;
            end++;
        }
    }

}
// @lc code=end
