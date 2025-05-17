class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int max=0;
        int i=0;
        while(i<n){
            if(i>max)return false;
            max=Math.max(max,i+nums[i]);
            i++;
        }
        return true;
    }
}