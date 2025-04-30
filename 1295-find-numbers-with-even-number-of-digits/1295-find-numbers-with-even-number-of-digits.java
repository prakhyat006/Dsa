class Solution {
    public static int len(int number){
        return (int) Math.log10(number) + 1;
    }
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(len(nums[i])%2==0)count++;
        }
        return count;
    }
}