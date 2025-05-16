class Solution {
    public static int max = 0;
    public static int l = 0;
    public static void palin(String s,int start,int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        if(max < end -start- 1) {
            max = end-start- 1;
            l = start+1;
        }
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        if(s.length() < 2) {
            return s;
        }
        for(int i=0;i<n;i++){
                palin(s,i,i);
                palin(s,i,i+1);
        }
        return s.substring(l,l+max);
    }
}