class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out =new int[2];
        for(int j=0;j<nums.length-1;j++){
        for(int i=j+1;i<nums.length;i++){
            if(nums[j]+nums[i]==target){
                out[0]=j;
                out[1]=i;
            }
        }
        }
        return out;
    }
}