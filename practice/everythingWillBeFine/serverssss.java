package everythingWillBeFine;

import java.util.Collections;
import java.util.PriorityQueue;

public class serverssss {
    public static void main(String[] args) {
        int vouchersCount = 50;
        int[] prices = {8, 2, 13};
        System.out.println(calculateTikTokShoppingCost(vouchersCount, prices));
    }

    public static int calculateTikTokShoppingCost(int vouchersCount, int[] prices) {
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int price : prices) {
            maxHeap.offer((double) price);
        }
        double sum = 0;

        for (int i = 0; i < vouchersCount; i++) {
            double price = maxHeap.poll();
            maxHeap.offer(price / 2);
        }
        while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }
        return (int) sum;
    }
}
