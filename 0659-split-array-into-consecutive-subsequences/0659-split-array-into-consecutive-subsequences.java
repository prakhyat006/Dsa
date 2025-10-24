import java.util.*;

class Solution {
    public boolean isPossible(int[] nums) {
        // Map: last number -> min heap of lengths of subsequences ending with that number
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int num : nums) {
            // If there's a subsequence ending with num-1
            if (map.containsKey(num - 1)) {
                PriorityQueue<Integer> prevHeap = map.get(num - 1);
                int smallest = prevHeap.poll(); // take shortest subsequence
                if (prevHeap.isEmpty()) map.remove(num - 1);

                // extend it with current num
                map.computeIfAbsent(num, k -> new PriorityQueue<>()).offer(smallest + 1);
            } else {
                // start a new subsequence [num]
                map.computeIfAbsent(num, k -> new PriorityQueue<>()).offer(1);
            }
        }

        // check all subsequences have length ≥ 3
        for (PriorityQueue<Integer> heap : map.values()) {
            if (heap.peek() < 3) return false;
        }

        return true;
    }
}
