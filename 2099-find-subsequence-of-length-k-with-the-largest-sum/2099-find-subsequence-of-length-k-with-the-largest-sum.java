class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] ans=new int[k];
        for(int i=n-1;i>=0&&k>0;i--){
            k--;
            ans[k]=nums[i];   
        }
        return ans;
    }
}