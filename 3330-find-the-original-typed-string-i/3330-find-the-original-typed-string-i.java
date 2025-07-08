class Solution {
    public int possibleStringCount(String word) {
       int n=word.length();
       int count=0;
       Character a=word.charAt(0);
       for(int i=0;i<n;i++){
        if(word.charAt(i)==a){
            count++;
        }else{
            a=word.charAt(i);
        }
       }
       return count;
    }
}