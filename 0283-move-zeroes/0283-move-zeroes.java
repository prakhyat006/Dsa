class Solution {
    public void moveZeroes(int[] arr) {
          for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0){
                    arr[j]=arr[j]+arr[i]-(arr[i]=arr[j]);
                }
            }
        }
    }
}