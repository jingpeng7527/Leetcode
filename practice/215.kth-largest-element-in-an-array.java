/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> maxqQueue = new PriorityQueue<>(Collections.reverseOrder());
        // // maxqQueue.addAll(nums);
        // for (Integer integer : nums) {
        //     maxqQueue.add(integer);
        // }
        // for (int i = 0; i < k-1; i++) {
        //     maxqQueue.poll();
        // }
        // return maxqQueue.poll();

        // heapSort(nums, k);
        // return nums[nums.length - k];

        quicksort(nums, 0, nums.length - 1, k);
        return nums[nums.length - k];
    }
    
    public void quicksort(int[] nums, int left, int right, int k) {
        if (left < right) {
            int pivot = partition(nums, left, right);
            if (pivot == nums.length - k) {
                return;
            } else if (pivot < nums.length - k) {
                int lo = pivot + 1;
                while (lo < k && nums[lo] == nums[lo - 1]) lo++;
                quicksort(nums, lo, right, k);
            } else {
                int hi = pivot - 1;
                while (hi > nums.length - k && nums[hi] == nums[hi + 1]) hi--;
                quicksort(nums, left, hi, k);
            }
        }
    }

    public int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }


    // public void heapSort(int[] nums, int k) {
    //     // build max heap
    //     buildMaxHeap(nums);

    //     // sort
    //     for(int i = 0; i < k; i++) {
    //         swap(nums, 0, nums.length - i - 1);
    //         heapify(nums, nums.length- i -1, 0);
    //      }

    // }

    // public void buildMaxHeap(int[] nums) {
    //     for(int i = nums.length / 2 - 1; i >= 0; i--){
    //         heapify(nums, nums.length, i);
    //     }
    // }
    
    // public void heapify(int[] nums, int length, int i) {
    //     int l = 2 * i + 1;
    //     int r = 2 * i + 2;

    //     int largest = i;
    //     if (l < length && nums[l] > nums[largest]) {
    //         largest = l;
    //     }

    //     if (r < length && nums[r] > nums[largest]) {
    //         largest = r;
    //     }

    //     if (largest != i) {
    //         swap(nums, i, largest);
    //         heapify(nums, length, largest);
    //     }
    // }
    
    public void swap(int[] nums, int left, int right) {
        int i = nums[left];
        nums[left] = nums[right];
        nums[right] = i;
    }
}
// @lc code=end