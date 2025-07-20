class Solution {
    public int lengthOfLongestSubstring(String s) {
     Set<Character> ls=new HashSet<>();
     int n=s.length();
     int max=0;
     int left=0;
     for(int i=0;i<n;i++){
     
        while(ls.contains(s.charAt(i))){
            ls.remove(s.charAt(left));
            left++;
        }
     ls.add(s.charAt(i));
     max=Math.max(max,ls.size());
     }
     return max;
    }
}