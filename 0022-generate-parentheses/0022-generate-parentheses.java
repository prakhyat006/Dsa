class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList<>();
        par(n,0,0,"",ls);
        return ls;
    }
    public void par(int n,int open,int close,String s,List<String> ls){
        if(open==n && close==n){
            ls.add(s);
            return ;
        }
        if(open<n){
            par(n,open+1,close,s+"(",ls);
        }
        if(open>close){
            par(n,open,close+1,s+")",ls);
        }
    }
}