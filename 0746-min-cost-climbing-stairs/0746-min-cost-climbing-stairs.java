class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int n=cost.length;
        int[] dp=new int[n];
        int i=n-1;
        int val=0;
        while(i>0){
            if(cost[i]<cost[i-1]){
                val=val+cost[i];
                i--;
            }else{
                val=val+cost[i-1];
                i=i-2;
            }
        }
        return val;
    }
}