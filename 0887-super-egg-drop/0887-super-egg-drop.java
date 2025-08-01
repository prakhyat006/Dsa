class Solution {
    public int superEggDrop(int K, int N) {
        int[] dp = new int[K + 1];
        int step = 0;
        
        while (dp[K] < N) {
            step++;
            for (int i = K; i >= 1; i--) {
                dp[i] = 1 + dp[i] + dp[i - 1];
            }
        }
        
        return step;
    }
}
