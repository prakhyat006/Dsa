class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int count=Integer.MAX_VALUE;
       int n=nums.length;
       int sum=0;
       int j=0;
      for(int i=0;i<n;i++){
        sum +=nums[i];
        while(sum>=target){
            if(i-j+1<count){
                count=i-j+1;
            }
            sum=sum-nums[j];
            j++;
        }

    }
       return count==Integer.MAX_VALUE?0:count;
    }
}