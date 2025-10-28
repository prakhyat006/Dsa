class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int x : nums) sum += x;

        int cur = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            cur += nums[i];
            if (nums[i] == 0) {
                // Check both even and odd sum conditions
                if (2 * cur == sum) ans += 2;
                else if (Math.abs(sum - 2 * cur) == 1) ans++;
            }
        }
        return ans;
    }
}
