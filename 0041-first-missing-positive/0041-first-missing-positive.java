class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int curr = nums[i] - 1;
            if(curr >= 0 && curr < nums.length && nums[i] != nums[curr]){
               int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            }
            else{
                i++;
            }
        }
        for (int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    }
