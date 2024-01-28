/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        int temp = 0;
        char prev = chars[0];
        int res = 0;

        for (int i = 0; i < chars.length; i++) {
            if (prev == chars[i]) {
                temp++;
            } else {
                chars[res] = prev;
                res++;
                if (temp != 1) {
                    if (temp>=1000) {
                        chars[res] = (char) (temp / 1000 + '0');
                        res++;
                        chars[res] = (char) (temp % 1000 / 100 + '0');
                        res++;
                        chars[res] = (char) (temp % 100 / 10 + '0');
                        res++;
                        chars[res] = (char) (temp % 10 + '0');
                        res++;
                    } else if (temp>=100) {
                        chars[res] = (char) (temp / 100 + '0');
                        res++;
                        chars[res] = (char) (temp % 100 / 10 + '0');
                        res++;
                        chars[res] = (char) (temp % 10 + '0');
                        res++;
                    } else if (temp>=10) {
                        chars[res] = (char) (temp / 10 + '0');
                        res++;
                        chars[res] = (char) (temp % 10 + '0');
                        res++;
                    } else {
                        chars[res] = (char) (temp + '0');
                        res++;
                    }
                }
                temp = 1;
            }
            // System.out.println(chars[i] + " " + temp);
            prev = chars[i];
            // System.out.println(prev);
        }

        chars[res] = prev;
        res++;
        if (temp != 1) {
            if (temp>=1000) {
                chars[res] = (char) (temp / 1000 + '0');
                res++;
                chars[res] = (char) (temp % 1000 / 100 + '0');
                res++;
                chars[res] = (char) (temp % 100 / 10 + '0');
                res++;
                chars[res] = (char) (temp % 10 + '0');
                res++;
            } else if (temp>=100) {
                chars[res] = (char) (temp / 100 + '0');
                res++;
                chars[res] = (char) (temp % 100 / 10 + '0');
                res++;
                chars[res] = (char) (temp % 10 + '0');
                res++;
            } else if (temp>=10) {
                chars[res] = (char) (temp / 10 + '0');
                res++;
                chars[res] = (char) (temp % 10 + '0');
                res++;
            } else {
                chars[res] = (char) (temp + '0');
                res++;
            }
        }

        return res;
    }
    
}
// @lc code=end
