import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String string : strs) {
            // char[] c = string.toCharArray();
            // Arrays.sort(c);
            // String key = new String(c);

            int[] counts = new int[26];
            int length = string.length();
            for (int i = 0; i < length; i++) {
                counts[string.charAt(i) - 'a']++;
            }
            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(counts[i]);
                }
                // System.out.println(sb.toString());
            }
            String key = sb.toString();
            // System.out.println(key);

            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(string);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
// @lc code=end

