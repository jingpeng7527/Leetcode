import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
        set.add(n);
        n = getNextNumber(n);
        }
        return n == 1;

    //     int sum = n;

    //     if (n == 1) {
    //         return true;
    //     }

    //     // int a, b,c = 0;

    //     while (!set.contains(sum)) {
    //         // if (!set.contains(n)) {
    //         set.add(sum);
    //         System.out.println(set.toString());
    //         // }
    //         n = sum;
    //         sum = 0;

    //         while (n != 0) {
    //             int temp = n % 10;
    //             sum += temp * temp;
    //             n = n / 10;
    //         }

    //         if (set.contains(sum) && sum != 1) {
    //             return false;
    //         } else if (sum == 1) {
    //             break;
    //         }
    //     }

    //     return true;

    }

    private int getNextNumber(int n) {
    int res = 0;
    while (n > 0) {
    int temp = n % 10;
    res += temp * temp;
    n = n / 10;
    }
    return res;
    }
}

// @lc code=end
