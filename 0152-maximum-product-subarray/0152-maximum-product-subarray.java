class Solution {
    public int maxProduct(int[] nums) {
     if (nums == null || nums.length == 0) return 0;
    
    int maxEndingHere = nums[0];
    int minEndingHere = nums[0];
    int maxSoFar = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        int temp = maxEndingHere;
        maxEndingHere = Math.max(nums[i], Math.max(maxEndingHere * nums[i], minEndingHere * nums[i]));
        minEndingHere = Math.min(nums[i], Math.min(temp * nums[i], minEndingHere * nums[i]));
        
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }
    
    return maxSoFar;
    }
}