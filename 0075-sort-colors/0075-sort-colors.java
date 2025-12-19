class Solution {
    public void sortColors(int[] arr) {
      int zero=0,one=0,two=0;
      int n=arr.length;
      for(int i=0;i<n;i++){
        if(arr[i]==0)zero++;
        else if(arr[i]==1)one++;
        else two++;
      }
      for(int i=0;i<n;i++){
        if(zero>0){
            arr[i]=0;
            zero--;
        }else if(one>0){
            arr[i]=1;
            one--;
        }else {
            arr[i]=2;
            
        }     
      }
    }
}