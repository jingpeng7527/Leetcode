/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        int write = 0;
        char cur = chars[0];
        int count = 0;
        int i = 0;

        while (i < chars.length) {
            // System.out.println("kk");

            while (i < chars.length && chars[i] == cur) {
                i++;
                count++;
            }

            // System.out.println("chars");
            chars[write++] = cur;
            if (count > 1) {
                int anc = write;
                while (count > 0) {
                    chars[write++] = (char) (count % 10 + '0');
                    count /= 10;
                }
                reverse(chars, anc, write - 1);
            }
            if (i<chars.length) {
                cur = chars[i];
            }
            count = 0;
        }

        return write;

        // int cur = 0;
        // int write = 0;
        // int move = 0;
        // int count = 0;

        // while (move < chars.length) {
        // if (chars[move] == chars[cur]) {
        // count++;
        // move++;
        // } else {
        // chars[write++] = chars[cur];
        // if (count > 1) {
        // int anc = write;
        // while (count > 0) {
        // chars[write++] = (char) (count % 10 + '0');
        // count /= 10;
        // }
        // reverse(chars, anc, write - 1);
        // // System.out.println(cur+" "+write+" "+move);
        // }
        // cur = move;
        // count = 0;
        // }
        // }

        // chars[write++] = chars[cur];
        // if (count > 1) {
        // int anc = write;
        // while (count > 0) {
        // chars[write++] = (char) (count % 10 + '0');
        // count /= 10;
        // }
        // reverse(chars, anc, write-1);
        // }

        // return write;

        // int temp = 0;
        // char prev = chars[0];
        // int res = 0;

        // for (int i = 0; i < chars.length; i++) {
        // if (prev == chars[i]) {
        // temp++;
        // } else {
        // chars[res] = prev;
        // res++;
        // if (temp != 1) {
        // if (temp>=1000) {
        // chars[res] = (char) (temp / 1000 + '0');
        // res++;
        // chars[res] = (char) (temp % 1000 / 100 + '0');
        // res++;
        // chars[res] = (char) (temp % 100 / 10 + '0');
        // res++;
        // chars[res] = (char) (temp % 10 + '0');
        // res++;
        // } else if (temp>=100) {
        // chars[res] = (char) (temp / 100 + '0');
        // res++;
        // chars[res] = (char) (temp % 100 / 10 + '0');
        // res++;
        // chars[res] = (char) (temp % 10 + '0');
        // res++;
        // } else if (temp>=10) {
        // chars[res] = (char) (temp / 10 + '0');
        // res++;
        // chars[res] = (char) (temp % 10 + '0');
        // res++;
        // } else {
        // chars[res] = (char) (temp + '0');
        // res++;
        // }
        // }
        // temp = 1;
        // }
        // // System.out.println(chars[i] + " " + temp);
        // prev = chars[i];
        // // System.out.println(prev);
        // }

        // chars[res] = prev;
        // res++;
        // if (temp != 1) {
        // if (temp>=1000) {
        // chars[res] = (char) (temp / 1000 + '0');
        // res++;
        // chars[res] = (char) (temp % 1000 / 100 + '0');
        // res++;
        // chars[res] = (char) (temp % 100 / 10 + '0');
        // res++;
        // chars[res] = (char) (temp % 10 + '0');
        // res++;
        // } else if (temp>=100) {
        // chars[res] = (char) (temp / 100 + '0');
        // res++;
        // chars[res] = (char) (temp % 100 / 10 + '0');
        // res++;
        // chars[res] = (char) (temp % 10 + '0');
        // res++;
        // } else if (temp>=10) {
        // chars[res] = (char) (temp / 10 + '0');
        // res++;
        // chars[res] = (char) (temp % 10 + '0');
        // res++;
        // } else {
        // chars[res] = (char) (temp + '0');
        // res++;
        // }
        // }

        // return res;
    }

    public void reverse(char[] chars, int left, int right) {
        while (left < right) {
            // System.out.println(chars[left]+" "+ chars[right]);
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

}
// @lc code=end
