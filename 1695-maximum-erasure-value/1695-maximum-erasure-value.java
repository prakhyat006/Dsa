import java.util.*;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        int start = 0, maxSize = 0, maxSum = 0, currSum = 0;
        for (int i = 0; i < nums.length;i++){
            while (ls.contains(nums[i])) {
                currSum -= ls.get(0);
                ls.remove(0);
                start++;
            }
            ls.add(nums[i]);
            currSum += nums[i];
            if (maxSize < ls.size()) {
                maxSize = ls.size();
            }
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(start + " " + maxSize);
        return maxSum;
    }
}
