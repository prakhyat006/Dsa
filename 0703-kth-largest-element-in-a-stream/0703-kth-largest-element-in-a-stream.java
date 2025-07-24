class KthLargest {
PriorityQueue<Integer > ls;
int s=0;
    public KthLargest(int k, int[] nums) {
        s=k;
     ls=new PriorityQueue<>();
     for(int i=0;i<nums.length;i++){
            ls.offer(nums[i]);
            while(ls.size()>k){
                ls.poll();
            }
     }
    }
    
    public int add(int val) {
        ls.offer(val);
        while(ls.size()>s){
                ls.poll();
            }
            return ls.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */