class Solution {
    public int maxSum(int[] nums) {
        int sum=0;
        int n=nums.length;
        HashSet<Integer> ls=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0)ls.add(nums[i]);
        }
        int max=-101;
        if(ls.size()==0){
            for(int i=0;i<n;i++){
             if(nums[i]>max)max=nums[i];
        }
        }
        for(int i:ls)sum +=i;
        return sum==0?max:sum;
    }
}