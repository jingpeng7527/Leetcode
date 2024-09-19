import java.util.Arrays;
import java.util.List;

public class GoodSubsegments {
    public static int countGoodSubsegments(int numServers, int numDisconnectedPairs, List<int[]> disconnectedPairs) {
        // 用来记录每个服务器和其之前断开连接的最近位置
        int[] lastDisconnected = new int[numServers + 1];
        Arrays.fill(lastDisconnected, 0); // 初始化为0，表示没有断开连接的对

        // 标记每对断开连接的服务器
        for (int[] pair : disconnectedPairs) {
            int a = pair[0];
            int b = pair[1];
            // 对于较大的服务器位置，它的开始点最早不能小于较小的服务器
            lastDisconnected[Math.max(a, b)] = Math.max(lastDisconnected[Math.max(a, b)], Math.min(a, b));
        }

        int goodSubsegmentsCount = 0;
        int start = 1;

        // 滑动窗口，end 从1到 numServers
        for (int end = 1; end <= numServers; end++) {
            // 维护窗口的左边界 start
            start = Math.max(start, lastDisconnected[end] + 1);
            
            // 计算以 end 结尾的子区间数量
            goodSubsegmentsCount += (end - start + 1);
        }

        return goodSubsegmentsCount;
    }


    // public static int countGoodSubsegments(int numServers, int numDisconnectedPairs, List<int[]> disconnectedPairs) {
    //     boolean[] isconneced = new boolean[numServers - 1];
    //     Arrays.fill(isconneced, true);

    //     for(int[] pair: disconnectedPairs){
    //         int a = pair[0] - 1;
    //         int b = pair[1] - 1;
    //         if(Math.abs(a - b) == 1){
    //             isconneced[Math.min(a, b)] = false;
    //         }
    //     }

    //     int goodSubsegmentsCount = 0;
    //     int start = 0;
    //     while (start<numServers) {
    //         int end = start;
    //         while(end<numServers && (end == start || (end > start && isconneced[end - 1]))){
    //             end++;
    //         }
    //         int length = end - start;
    //         goodSubsegmentsCount += (length * (length + 1)) / 2;
    //         start = end;
    //     }

    //     return goodSubsegmentsCount;
    // }

    public static void main(String[] args) {
        int numServers = 5;
        int numDisconnectedPairs = 3;
        List<int[]> disconnectedPairs = Arrays.asList(
                new int[]{1, 2},
                new int[]{4, 5},
                new int[]{2, 3}
        );

        int result = countGoodSubsegments(numServers, numDisconnectedPairs, disconnectedPairs);
        System.out.println(result);  // Output: 5
    }
}
