/*
 * @lc app=leetcode id=841 lang=java
 *
 * [841] Keys and Rooms
 */

// @lc code=start
class Solution {
    Set<Integer> opened = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visit(rooms, 0);
        return (opened.size() == rooms.size());
    }

    public void visit(List<List<Integer>> rooms, int room) {
        if (!opened.contains(room)) {
            opened.add(room);
            for (Integer i : rooms.get(room)) {
                visit(rooms, i);
            }
        }
    }
}
// @lc code=end
