class Solution {
    public int maxProfit(int[] arr) {
       int i=0,j=0,n=arr.length;
       int buy=0,sell=0;
       for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    if(sell<arr[j]-arr[i]) sell=arr[j]-arr[i];
                }else break;
            }
       }
       return sell;
    }
}
