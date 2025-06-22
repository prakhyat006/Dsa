class Solution {
    public int removeElement(int[] nums, int val) {
        int out[]=new int[100];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                out[count]=nums[i];
                count++;
            }
            out=nums;
        }return count;
    }
}