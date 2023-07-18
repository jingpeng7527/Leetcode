/*
 * @lc app=leetcode id=692 lang=java
 *
 * [692] Top K Frequent Words
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : words) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        // System.out.println(map);

        List<String> res = new ArrayList<>();

        PriorityQueue<String> minHeap = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                if (map.get(a).equals(map.get(b))) {
                    return b.compareTo(a);
                } else {
                    return map.get(a) - map.get(b);
                }
            }
        });

        for (String string : map.keySet()) {
            minHeap.add(string);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        while (!minHeap.isEmpty()) {
            res.add(minHeap.poll());
        }
        Collections.reverse(res);
        return res;


        // new compartor
        // List<String> res = new ArrayList<>(map.keySet());
        // res.sort(new Comparator<String>() {
        //     @Override
        //     public int compare(String a, String b) {
        //         if (map.get(a).equals(map.get(b))) {
        //             return a.compareTo(b);
        //         } else {
        //             return map.get(b) - map.get(a);
        //         }
        //     }
        // });
        // return res.subList(0,k);
    }
}
// @lc code=end

