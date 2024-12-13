import java.util.*;

public class Locker {
    private Map<String, Queue<Integer>> lockerMap = new HashMap<>();
    private Map<Integer, String> itemMap = new HashMap<>();

    public Locker(int s, int m, int l) {
        for (int i = 0; i < s; i++) {
            lockerMap.computeIfAbsent("s", k -> new LinkedList<>()).add(i);
        }
        for (int i = 0; i < m; i++) {
            lockerMap.computeIfAbsent("m", k -> new LinkedList<>()).add(i);
        }
        for (int i = 0; i < l; i++) {
            lockerMap.computeIfAbsent("l", k -> new LinkedList<>()).add(i);
        }
    }

    public void store(String size, int id) {
        Queue<Integer> lockerQueue = lockerMap.get(size);
        if (lockerQueue == null || lockerQueue.isEmpty()) {
            System.out.println("No locker available for size " + size);
            return;
        }
        int lockerId = lockerQueue.poll();
        itemMap.put(id, size + lockerId);
        System.out.println("Stored item " + id + " in locker " + size + lockerId);
    }

    public void retrieve(int id) {
        String lockerInfo = itemMap.remove(id);
        if (lockerInfo == null) {
            System.out.println("Item " + id + " not found");
            return;
            
        }
        String size = lockerInfo.substring(0, 1);
        int lockerId = Integer.parseInt(lockerInfo.substring(1));
        lockerMap.get(size).add(lockerId);
        System.out.println("Retrieved item " + id + " from locker " + size + lockerId);
    }

    public static void main(String[] args) {
        Locker locker = new Locker(3, 5, 8);
        locker.store("s", 101);
        locker.store("m", 102);
        locker.retrieve(101);
        locker.retrieve(102);
    }
}