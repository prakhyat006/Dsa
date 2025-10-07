class Solution {
    public boolean detectCapitalUse(String w) {
        int n=w.length();
        if(w.charAt(0)>=97){
            for(int i=0;i<n;i++)if(w.charAt(i)<97)return false;            
        }else{
            if(n>1){
                if(w.charAt(1)>=65 && w.charAt(1)<=90){
                    for(int i=0;i<n;i++)if(w.charAt(i)>=97)return false;
                }else{
                    for(int i=1;i<n;i++)if(w.charAt(i)<97)return false; 
                }
            }else return true;
        }
        return true;
    }
}