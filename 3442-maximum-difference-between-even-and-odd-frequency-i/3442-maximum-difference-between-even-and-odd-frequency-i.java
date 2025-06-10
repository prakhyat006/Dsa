class Solution {
    public int maxDifference(String s) {
        int[] ch =new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            ch[s.charAt(i)-'a'] +=1;
        }
        int odd=0;
        int even = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(ch[i]%2==0&&ch[i]!=0)even=Math.min(even,ch[i]);
            else odd=Math.max(ch[i],odd);
        }
        return odd-even;
    }
}