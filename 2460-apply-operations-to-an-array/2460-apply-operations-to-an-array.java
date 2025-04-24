class Solution {
    public int[] applyOperations(int[] num) {
       int n=num.length;
        for(int i=0;i<n-1;i++){
            if(num[i]==num[i+1]){
                num[i] *=2;
                num[i+1]=0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(num[j]==0){
                    num[j]=num[j+1]+num[j]-(num[j+1]=num[j]);
                }
            }
        }
        return num;
    }
}