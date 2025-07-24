import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int i = 0;
        // Initial window
        for (i = 0; i < k; i++) {
            pq.offer(nums[i]);
        }
        ans[0] = pq.peek();

        // Slide the window
        for (i = k; i < n; i++) {
            int out = nums[i - k];
            int in = nums[i];
            pq.remove(out);   // Costly operation, O(n)
            pq.offer(in);
            ans[i - k + 1] = pq.peek();
        }

        return ans;
    }
}
