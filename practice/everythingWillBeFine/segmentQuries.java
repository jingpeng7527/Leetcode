import java.util.HashMap;

public class segmentQuries {
    public static void main(String[] args) {
        int n = 5, q = 2;
        int[] cat = new int[] { 1, 2, 1, 1, 3 };
        int[] cnt = new int[] { 5, 3, 4, 5, 2 };
        int[] l = new int[] { 1, 1 };
        int[] r = new int[] { 3, 5 };
        
        int[] res = new int[l.length];

        for (int i = 0; i < q; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int left = l[i];
            int right = r[i];
            for (int j = left - 1; j < right; j++) {
                if (!map.containsKey(cat[j]) || map.get(cat[j]) < cnt[j]) {
                    map.put(cat[j], cnt[j]);
                }
                cnt[j] = 0;
            }

            for (int p : map.keySet()) {
                res[i] += map.get(p);
            }
        }

        for (int i : res) {
            System.out.println(i);
        }
    }
}
