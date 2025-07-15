class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack( n, k,res,new ArrayList<>(),1);
        return res;
    }
    public void backtrack(int n,int k,List<List<Integer>> res,ArrayList<Integer> subset,int start){
        if(subset.size()==k){
            res.add(new ArrayList<>(subset));
            return ;
        }
        for(int i=start;i<=n;i++){
            subset.add(i);
            backtrack(n,k,res,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }
}