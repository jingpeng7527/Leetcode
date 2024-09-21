/*
 * @lc app=leetcode id=399 lang=java
 *
 * [399] Evaluate Division
 */

import java.util.Map;
import java.util.HashMap;
import java.util.List;

// @lc code=start
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res = new double[queries.size()];
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            res[i] = dfs(query.get(0), query.get(1), graph, new HashSet<>());
        }
        return res;
    }

    public Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> map = new HashMap<>();

        for (int i = 0; i < values.length; i++) {
            List<String> str = equations.get(i);
            Map<String, Double> nei1 = map.getOrDefault(str.get(0), new HashMap<>());
            nei1.put(str.get(1), values[i]);
            map.put(str.get(0), nei1);

            Map<String, Double> nei2 = map.getOrDefault(str.get(1), new HashMap<>());
            nei2.put(str.get(0), 1 / values[i]);
            map.put(str.get(1), nei2);
        }
        return map;
    }

    public double dfs(String d1, String d2, Map<String, Map<String, Double>> map, Set<String> visited){
        
        if(!map.containsKey(d1) || !map.containsKey(d2)){
            return -1;
        }else if (d1.equals(d2)){
            return 1;
        }else{
            visited.add(d1);
            for(String neigh: map.get(d1).keySet()){
                if(!visited.contains(neigh)){
                    double tem = dfs(neigh, d2, map, visited);
                    if(tem != -1){
                        return tem * map.get(d1).get(neigh);
                    }
                }
            }
            return -1;
        }
    }
}
// @lc code=end

