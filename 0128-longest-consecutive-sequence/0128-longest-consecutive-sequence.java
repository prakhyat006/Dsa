class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> ls=new TreeSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            ls.add(nums[i]);
        }
        int c=0;
        int ans=0;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:ls){
            l.add(i);
        }
        n=l.size();
        for(int i=0;i<n-1;i++){
            if(l.get(i+1)-l.get(i)==1)c++;
            else c=0;
            ans=Math.max(ans,c);
        }
        return ans==0?0:ans+1;
    }
}