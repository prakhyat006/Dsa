class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int val=0;
        int c=0;
        int ans=Integer.MAX_VALUE;
        int i=0;
        while(i<n){
            val=val|nums[i];
            if(val>=k)return 1;
            int j=i+1;
            while(j<n){
                val=val|nums[j];
                System.out.println(val);
                if(val>=k){
            
                    c=j-i+1;
                    ans=Math.min(ans,c);
                    break;
                }
                j++;
            }
            val=0;
            i++;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}