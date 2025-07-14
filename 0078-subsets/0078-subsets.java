class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        back(nums,res,new ArrayList<Integer>(),0);
        return res;
    }
    public void back(int[] nums,List<List<Integer>> res,List<Integer> subset,int start){
        res.add(new ArrayList<>(subset));
        for(int i=start;i<nums.length;i++){
            subset.add(nums[i]);
            back(nums,res,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }
}