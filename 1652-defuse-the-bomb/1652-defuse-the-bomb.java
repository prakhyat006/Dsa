class Solution {
    public int[] decrypt(int[] arr, int k) {
       int arr1[]=new int[arr.length];
     
       if(k==0){
        for(int i=0;i<arr.length;i++){
            arr1[i]=0;
        }
       }
       int sum=0;
       if(k>0){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1,f=0;f<k;j++,f++){
                sum=arr[j%arr.length]+sum;
            }
            arr1[i]=sum;
            sum=0;
        }
       }
       int h=arr.length;
       if(k<0){
        int z=k*-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1,f=0;f<z;j++,f++){
                sum=arr[(i+h+f-z)%h]+sum;
            } 
            arr1[i]=sum;
            sum=0;
        }
       }
       return arr1; 
    }
}