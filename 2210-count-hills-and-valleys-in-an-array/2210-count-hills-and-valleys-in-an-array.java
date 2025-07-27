class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length-1;
        int h=0;
        int j=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i+1]){
                if((nums[i]>nums[j]&&nums[i]>nums[i + 1])|| (nums[i]<nums[j] && nums[i]<nums[i+1])) {
                    h++;
                }
                j= i;
            }
        }
        return h;
    }
}