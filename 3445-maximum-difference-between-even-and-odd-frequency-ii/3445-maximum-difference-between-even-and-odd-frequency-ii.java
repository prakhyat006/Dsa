class Solution {

    public int maxDifference(String s, int k) {
        int n = s.length();
        // Initialize answer to a very small number.
        int ans = Integer.MIN_VALUE;

        // Step 1: Iterate through all possible pairs of distinct characters (a, b).
        for (char a = '0'; a <= '4'; ++a) {
            for (char b = '0'; b <= '4'; ++b) {
                if (a == b) {
                    continue;
                }

                // --- Start of logic for a single (a, b) pair ---

                // best[status] stores the minimum (prev_a - prev_b) for a prefix
                // with the parity state 'status'. Initialize with a large value.
                int[] best = new int[4];
                Arrays.fill(best, Integer.MAX_VALUE);

                // cnt_a, cnt_b: Prefix counts for the 'right' pointer (s[0...right]).
                int cnt_a = 0, cnt_b = 0;
                // prev_a, prev_b: Prefix counts for the 'left' pointer (s[0...left]).
                int prev_a = 0, prev_b = 0;
                // 'left' tracks the end of the prefix we are recording in the 'best' array.
                int left = -1;
                for (int right = 0; right < n; ++right) {
                    cnt_a += (s.charAt(right) == a) ? 1 : 0;
                    cnt_b += (s.charAt(right) == b) ? 1 : 0;
                    while (right - left >= k && cnt_b - prev_b >= 2) {
                        int left_status = getStatus(prev_a, prev_b);
                        best[left_status] = Math.min(
                                best[left_status],
                                prev_a - prev_b
                        );
                        ++left;
                        prev_a += (s.charAt(left) == a) ? 1 : 0;
                        prev_b += (s.charAt(left) == b) ? 1 : 0;
                    int right_status = getStatus(cnt_a, cnt_b);
                    int required_status = right_status ^ 0b10;
                    if (best[required_status] != Integer.MAX_VALUE) {
                        ans = Math.max(
                                ans,
                                cnt_a - cnt_b - best[required_status]
                        );
                    }
                }
            }
        }
        return ans;
    }
    private int getStatus(int cnt_a, int cnt_b) {
        return ((cnt_a & 1) << 1) | (cnt_b & 1);
    }
}