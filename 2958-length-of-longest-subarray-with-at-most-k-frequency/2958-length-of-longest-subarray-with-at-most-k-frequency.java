class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer,Integer> ls=new HashMap<>();
        int i=0;
        int n=nums.length;
        int j=0;
        int max=0;
        while( j<n){
            if(!ls.containsKey(nums[j])){
                ls.put(nums[j],1);
                j++;
            }
            else if(ls.get(nums[j])<k)
            {
                ls.put(nums[j],ls.get(nums[j])+1);
                j++;
            }
            else {
                ls.put(nums[i],ls.get(nums[i])-1);
                i++;
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}