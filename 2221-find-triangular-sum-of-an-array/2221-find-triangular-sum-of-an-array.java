class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int z=n;
        while(i<z){
            n--;
            j=0;
            while(j<n){
                nums[j]=(nums[j]+nums[j+1])%10;
                j++;
            }
            // System.out.println(nums[0]);
            i++;
        }
        return nums[0];
    }
}