class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        int n=nums.length;
        for(int i=0;i<n;i++){
            arr[nums[i]] +=1;
        }
        int max=0;
        for(int i=1;i<=100;i++){
            max=Math.max(max,arr[i]);
        }
        int c=0;
        for(int i=1;i<=100;i++)if(arr[i]==max)c++;
        return c*max;
    }
}