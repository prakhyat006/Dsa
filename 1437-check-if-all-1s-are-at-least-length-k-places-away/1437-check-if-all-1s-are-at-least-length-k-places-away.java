class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=0;
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        boolean t=false;
        for(int i=0;i<n;i++){
            if(nums[i]==0 ){
                c++;
            }else{
                if(t){
                    ans=Math.min(ans,c);
                    c=0;
                }else{
                    t=true;
                    // System.out.println(i);
                    c=0;
                }
            }
        }
        System.out.println(ans);
        return ans>=k?true:false;
    }
}