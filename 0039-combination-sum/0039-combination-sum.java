class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
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
            subset.add(nums[i]);
            backtrack(n,target-nums[i],res,subset,i,nums);
            subset.remove(subset.size()-1);
        }
    }
}