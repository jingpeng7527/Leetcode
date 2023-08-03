/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 把二维数组看成一维数组，然后用二分查找
        // tips: 行数和列数靠除法和取余来计算
        
        boolean result = false;

        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row * col - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;
            int midValue = matrix[mid / col][mid % col];
            if (midValue == target) {
                result = true;
                break;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


    //     int up = 0;
    //     int down = matrix.length - 1;
    //     int left = 0;
    //     int right = matrix[0].length - 1;
        
    //     int mid1 = 0;
    //     int mid2 = 0;

    //     while (up <= down) {
    //         mid1 = up + (down - up) / 2;
    //         if (matrix[mid1][0] == target) {
    //             result = true;
    //         }
    //         if (matrix[mid1][0] < target){
    //             if(matrix[mid1][matrix[0].length - 1] >= target) {
    //                 break;
    //             }else {
    //                 up = mid1 + 1;
    //             }
    //         } else {
    //             down = mid1 - 1;
    //         }
    //     }
        
    //     while (left <= right) {
    //         mid2 = left + (right - left) / 2;
    //         if (matrix[mid1][mid2] == target) {
    //             result = true;
    //         }
    //         if (matrix[mid1][mid2] < target) {
    //             left = mid2 + 1;
    //         } else {
    //             right = mid2 - 1;
    //         }
    //     }

        return result;
    }
}
// @lc code=end

