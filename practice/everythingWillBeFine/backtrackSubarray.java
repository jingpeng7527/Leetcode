import java.util.ArrayList;
import java.util.List;

public class backtrackSubarray {

    private static List<Integer> bestPartition;
    private static int maxSubarrays;

    public static void main(String[] args) {
        int[] arr1 = {3, -2, 4, -6, 1};
        int G1 = 2;
        printResult(maxPartition(arr1, G1));

        int[] arr2 = {3, 2, 4, 6, 1};
        int G2 = 0;
        printResult(maxPartition(arr2, G2));

        int[] arr3 = {8, 2, -5, 2};
        int G3 = 1;
        printResult(maxPartition(arr3, G3));
    }

    public static List<Integer> maxPartition(int[] arr, int G) {
        bestPartition = new ArrayList<>();
        maxSubarrays = 0;
        backtrack(arr, G, 0, new ArrayList<>(), 0, 0);
        return bestPartition.isEmpty() ? List.of(-1) : bestPartition;
    }

    private static void backtrack(int[] arr, int G, int start, List<Integer> currentPartition, long currentSum, int currentLength) {
        if (start == arr.length) {
            if (currentPartition.size() > maxSubarrays) {
                maxSubarrays = currentPartition.size();
                bestPartition = new ArrayList<>(currentPartition);
            }
            return;
        }

        for (int i = start; i < arr.length; i++) {
            currentSum += arr[i];
            currentLength++;
            if (currentSum >= (long) currentLength * G) {
                currentPartition.add(currentLength);
                backtrack(arr, G, i + 1, currentPartition, 0, 0);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    public static void printResult(List<Integer> result) {
        if (result.size() == 1 && result.get(0) == -1) {
            System.out.println(-1);
        } else {
            System.out.println(result.size());
            for (int length : result) {
                System.out.print(length + " ");
            }
            System.out.println();
        }
    }
}
