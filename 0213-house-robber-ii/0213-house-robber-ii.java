class Solution {
     public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        int res1 = dp_helper(nums, 0, len - 2);
        int res2 = dp_helper(nums, 1, len - 1);
        return Math.max(res1, res2);
    }

    int dp_helper(int[] nums, int start, int end) {
        int size = end - start + 1;
        if (size == 1) return nums[start];
        int[] dp = new int[size];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2; i < size; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start + i]);
        }
        return dp[size - 1];
    }
}