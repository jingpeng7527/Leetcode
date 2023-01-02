import java.util.*;

/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start

// class MyQueue {
//     Deque<Integer> deque = new LinkedList<>();

//     void poll(int val) {
//         if(!deque.isEmpty()&&deque.peek()==val){
//             deque.poll();
//         }
//     }
    
//     void add(int val) {
//         while (!deque.isEmpty() && deque.getLast() < val) {
//             deque.removeLast();
//         }
//         deque.add(val);
//     }
    
//     int peek() {
//         return deque.peek();   
//     }
// }


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < 2) return nums;
        // 双向队列 保存当前窗口最大值的数组位置 保证队列中数组位置的数值按从大到小排序
        LinkedList<Integer> queue = new LinkedList();
        // 结果数组
        int[] result = new int[nums.length-k+1];
        // 遍历nums数组
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.pollLast();
            }

            while (!queue.isEmpty() && queue.peek() < i - k + 1) {
                queue.poll();
            }

            queue.addLast(i);

            // 当窗口长度为k时 保存当前窗口中最大值
            if (i + 1 >= k) {
                result[i + 1 - k] = nums[queue.peek()];
            }
        }
        
        return result;
        // if (nums.length == 1) {
        //     return nums;
        // }
        // int len = nums.length - k;
        // //存放结果元素的数组
        // int[] res = new int[len+1];
        // // int num = 0;

        // MyQueue deque = new MyQueue();

        // for (int i = 0; i < k; i++) {
        //     deque.add(nums[i]);
        //     // System.out.println("ll" + deque.peek());
        // }

        // res[0] = deque.peek();
        // for (int i = 0; i < len; i++) {
        //     deque.poll(nums[i]);
        //     deque.add(nums[i + k]);
        //     res[i+1] = deque.peek();
        //     // System.out.println(deque.peek());
        // }
        // return res;
    }
}
// @lc code=end

