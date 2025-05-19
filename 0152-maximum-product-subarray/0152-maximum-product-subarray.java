class Solution {
    public int maxProduct(int[] nums) {
     int sum=nums[0];
        int max=nums[0];
        int n=nums.length;
       for(int i=1;i<n;i++){
        sum *=nums[i];
        max=Math.max(max,sum);
        max=Math.max(max,nums[i]);
        if(sum<0)sum=0;
       }
    return max;   
    }
}