/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i += 2 * k) {
            int left = i;
            int right = Math.min(s.length() - 1, left + k - 1);
            while (left < right) {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        return new String(a);
        // int n = s.length() / (2 * k);
        // int r = s.length() % (2 * k);
        // char[] a = s.toCharArray();
        // int left = 0;

        // while (left < n * k * 2) {
        // int right = left + k - 1;
        // swap(left, right, a);
        // left += 2 * k;
        // }

        // if (r >= k) {
        // int right = left + k - 1;
        // swap(left, right, a);
        // }

        // if (r < k && r > 0) {
        // int right = s.length()-1;
        // swap(left, right, a);
        // }
        // return String.valueOf(a);

    }

    // public void swap(int left, int right, char[] a) {
    // while (left < right) {
    // char temp = a[left];
    // a[left] = a[right];
    // a[right] = temp;
    // left++;
    // right--;
    // }
    // }

}
// @lc code=end
