class Solution {
    public int coinChange(int[] coins, int amount) {
       int n=coins.length;
       int[] dp=new int[amount+1];
       dp[0]=0;
       if(amount==0)return 0;
       int min=coins[0];
       for(int i=0;i<n;i++)min=Math.min(coins[i],min);
       if(amount<min)return -1;
       for(int i=0;i<n;i++){
       if(coins[i]<=amount)dp[coins[i]]=1;
    }
       dp[0]=0;
       for(int i=1;i<min;i++)dp[i]=-1;
       for(int i=min;i<=amount;i++){
        if(dp[i]==1)min=i;
        else dp[i]=dp[i-min]+dp[min];
       }
       for(int i:dp)System.out.println(i);
       return dp[amount]==0?-1:dp[amount];
    }
}