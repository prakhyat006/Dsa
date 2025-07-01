class Solution {
    public String finalString(String s) {
        int n=s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='i'){
                ans.reverse();
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}