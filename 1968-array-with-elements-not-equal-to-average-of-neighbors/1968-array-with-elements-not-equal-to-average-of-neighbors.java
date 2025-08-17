class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] res=new int[n];
        int l=0;
        int r=(n+1)/2;
        for(int i=0;i<n;i++){
            if(i%2==0)res[i]=nums[l++];
            else res[i]=nums[r++];
        }
        return res;
    }
}