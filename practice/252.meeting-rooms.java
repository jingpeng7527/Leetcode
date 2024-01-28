import java.util.Collections;
import java.util.Comparator;

/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

 class Solution {
     public boolean canAttendMeetings(List<Interval> intervals) {
            // Write your code here
            if(intervals == null || intervals.size() == 0){
                return true;
            }

            Collections.sort(intervals, new Comparator<Interval>() {
                @Override
                public int compare(Interval o1, Interval o2) {
                    return o1.start - o2.start;
                }
            });

            for(int i = 1; i < intervals.size(); i++){
                if(intervals.get(i).start < intervals.get(i - 1).end){
                    return false;
                }
            }
            return true;

            // Colletions.sort(list, new Comparator<Intervel>(){
            //     public int compare(Intervel o1, Intervel o2){
            //         return o1.start - o2.start;
            //     }
            // });

        // int start = 1001, end = 0;
        // for(int i = 0; i < intervals.size(); i++ ){
        //     Interval cur = intervals.get(i);
        //     if(cur.start >= start && cur.start < end){
        //         return false;
        //     }else if(cur.end <= end && cur.end > start){
        //         return false;
        //     }
        //     start = cur.start;
        //     end = cur.end;
        // }
        // return true;
    }
}