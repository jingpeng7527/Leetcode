/*
 * @lc app=leetcode id=912 lang=java
 *
 * [912] Sort an Array
 */

// @lc code=start

import java.util.Random;

class Solution {
    public int[] sortArray(int[] nums) {
        // quicksort(nums, 0, nums.length - 1);
        heapSort(nums);
        return nums;
    }

    public void heapSort(int[] nums) {
        // build max heap
        buildMaxHeap(nums);

        // sort
        for(int i = 0; i < nums.length; i++) {
            swap(nums, 0, nums.length - i - 1);
            heapify(nums, nums.length- i -1, 0);
         }

    }

    public void buildMaxHeap(int[] nums) {
        for(int i = nums.length / 2 - 1; i >= 0; i--){
            heapify(nums, nums.length, i);
        }
    }
    
    public void heapify(int[] nums,int length, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        int largest = i;
        if (l < length && nums[l] > nums[largest]) {
            largest = l;
        }
        
        if (r < length && nums[r] > nums[largest]) {
            largest = r;
        }
        
        if (largest != i) {
            swap(nums, i, largest);
            heapify(nums, length, largest);
        }
    }

    // // Lomuto's partition
    // public void quicksort(int[] nums, int left, int right) {

    //     if (left < right) {
    //         int k = new Random().nextInt(right - left + 1) + left;
    //         swap(nums, k, right);
    //         int i = left - 1;
    //         for (int j = left; j < right; j++) {
    //             if (nums[j] < nums[right]) {
    //                 i++;
    //                 swap(nums, i, j);
    //             }
    //         }
    //         swap(nums, i + 1, right);
    //         int p = i + 1;
    //         quicksort(nums, left, p - 1);
    //         quicksort(nums, p + 1, right);
    //     }
    // }
    
    // // Hoare's partition
    // public void quicksort(int[] nums, int left, int right) {
    //     
    //     if (left < right) {
    //         int i = left - 1;
    //         int j = right;
    //         int k = new Random().nextInt(right - left) + left;
    //         swap(nums, k, right);
    //         while (i < j) {
    //             do
    //                 i++;
    //             while (nums[i] < nums[right] && i < right);
    //             do
    //                 j--;
    //             while (nums[j] > nums[right] && j > left);

    //             if (i < j) {
    //                 swap(nums, i, j);
    //             }
    //         }
    //         swap(nums, i, right);
    //         quicksort(nums, left, j);
    //         quicksort(nums, i + 1, right);
    //     }
    // }

    
    public void swap(int[] nums, int left, int right) {
        int i = nums[left];
        nums[left] = nums[right];
        nums[right] = i;
    }

}
// @lc code=end
