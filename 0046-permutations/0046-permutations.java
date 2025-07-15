class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res,ArrayList<Integer> subset,int[] nums){
        if(subset.size()==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int num:nums){
            if(subset.contains(num))continue;
            subset.add(num);
            backtrack(res,subset,nums);
            subset.remove(subset.size()-1);
        }
    }
}