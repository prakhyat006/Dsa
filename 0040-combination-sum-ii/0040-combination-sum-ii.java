class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums.length,target,res,new ArrayList<>(),0,nums);
        return res;
    }
    public void backtrack(int n,int target,List<List<Integer>> res,ArrayList<Integer> subset,int start ,int[] nums){
        if(target==0){
            res.add(new ArrayList<>(subset));
            return ;
        }
        if(target<0)return ;
        for(int i=start;i<n;i++){
            if(i>start && nums[i]==nums[i-1])continue;
            subset.add(nums[i]);
            backtrack(n,target-nums[i],res,subset,i+1,nums);
            subset.remove(subset.size()-1);
        }
    }
}