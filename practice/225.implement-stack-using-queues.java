import java.util.*;

/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start
class MyStack {
    Queue<Integer> queue1;
    // Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<Integer>();
        // queue2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue1.offer(x);
        int size = queue1.size();
        while (size-- > 1) {
            queue1.offer(queue1.poll());
        }
    }

    public int pop() {
        return queue1.poll();

        // copy();
        // int re = queue1.poll();
        // queue1.addAll(queue2);
        // queue2.clear();
        // return re;
    }

    public int top() {
        return queue1.peek();
        // copy();
        // int re = queue1.peek();
        // queue2.add(queue1.poll());
        // queue1.addAll(queue2);
        // queue2.clear();
        // return re;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    // public void copy() {
    // if (queue1.size() == 1) {
    // return;
    // }

    // while (queue1.size() != 1) {
    // queue2.add(queue1.poll());
    // }
    // }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
