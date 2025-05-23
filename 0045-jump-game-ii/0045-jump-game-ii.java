class Solution {
    public int jump(int[] nums) {
        int jumps=0,curEnd = 0, cur= 0;
        int n=nums.length;
	for(int i=0;i<n-1;i++){
		cur = Math.max(cur, i + nums[i]);
		if (i == curEnd) {
			jumps++;
			curEnd = cur;
		}
	}
	return jumps;
    }
}