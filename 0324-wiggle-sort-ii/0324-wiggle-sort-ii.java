class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        n=n-1;
        Arrays.sort(arr);
        for(int i=1;i<nums.length;i=i+2){
            nums[i]=arr[n--];
        }
        for(int i=0;i<nums.length;i=i+2){
            nums[i]=arr[n--];
        }
        
    }
}