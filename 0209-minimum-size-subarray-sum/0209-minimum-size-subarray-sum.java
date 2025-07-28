class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int count=Integer.MAX_VALUE;
       int n=nums.length;
       int sum=0;
       int j=0;
       int i=0;
      while(i<n){
        sum +=nums[i];
        while(sum>=target){
            if(i-j+1<count){
                count=i-j+1;
            }
            sum=sum-nums[j];
            j++;
        }
        i++;
    }
       return count==Integer.MAX_VALUE?0:count;
    }
}