class Solution {
    public int maximumLength(int[] nums) {
        int c=nums[0]%2;
        int even=0;
        int odd=0;
        int both=0;
        for(int n:nums){
            if(n%2==0)even++;
            else odd++;
            if(n%2==c){
                both++;
                c=1-c;
            }
        }
        return Math.max(both,Math.max(even,odd));
    }
}