class Solution {
    public int longestPalindrome(String s) {
        int[] arr=new int[26];
        int n=s.length();
        for( Character i:s.toCharArray()){
            arr[i-'a'] +=1;
        }
        int sum=0;
        int one=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){

                if(arr[i]%2==0)sum +=arr[i];
                else{
                    sum +=arr[i]-1;
                     one =1;
                }
            }
        }
        return sum+one;
    }
}