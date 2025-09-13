class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a'] +=1;
        }
        int mv=0;
        int mc=0;
        for(int i=0;i<26;i++){
            if(i==0||i==4||i==8||i==20||i==14){
                mv=Math.max(mv,arr[i]);
            }else mc=Math.max(mc,arr[i]);
        }
        return mv+mc;
    }
}