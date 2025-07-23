import java.util.*;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int start = 0, maxSum = 0, currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            while (set.contains(nums[i])) {
                set.remove(ls.get(0));
                currSum -= ls.get(0);
                ls.remove(0);
                start++;
            }
            ls.add(nums[i]);
            set.add(nums[i]);
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
