/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start

import java.util.HashMap;

class LRUCache {
    class Node
    {
        int key;
        int value;
        Node prev;
        Node post;
    }
    
    HashMap<Integer, Node> cache = new HashMap<>();
    int capacity;
    Node head, tail;
    int count;


    public void add(Node node) {
        // add a node after head
        node.prev = head;
        node.post = head.post;

        head.post.prev = node;
        head.post = node;
    }

    public void remove(Node node) {
        // remove node before the tail
        // Node cur = tail.prev;

        node.prev.post = node.post;
        node.post.prev = node.prev;

        node.prev = null;
        node.post = null;
    }

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;

        head = new Node();
        head.prev = null;

        tail = new Node();
        tail.post = null;

        head.post = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node cur = cache.get(key);
        

        if (cur == null) {
            return -1;
        } else {
            // System.out.println(cur.key+" get");
            //update node's postion to head
            remove(cur);
            add(cur);
            return cur.value;
        }
    }
    
    public void put(int key, int value) {
        Node cur = cache.get(key);
        
        
        // if there is no such node:
        // 1. add the node to the hashmap
        // 2. check the list capacity
        // 3. if not full, add to the head; else remove the tail and add to the head

        // if there is such a node:
        // update its value and then move it to the head
        if (cur == null) {
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;

            cache.put(key, newNode);
            count++;
            // System.out.println("cccc"+count+"ll"+key);


            if (count > capacity) {
                // System.out.println("ooo");

                cache.remove(tail.prev.key);
                remove(tail.prev);

                // System.out.println("ooo"+ tail.prev.key);

            }
            add(newNode);
            
        } else {
            // System.out.println(cur.key + " put");
            cur.value = value;
            cache.replace(key, cur);
            remove(cur);
            add(cur);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

