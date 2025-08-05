class Solution {
    public int totalFruit(int[] f) {
      Map<Integer,Integer> ls=new HashMap<>();
      int n=f.length;
      int left=0;
      int max=0;
      for(int i=0;i<n;i++){
        ls.put(f[i],ls.getOrDefault(f[i],0)+1);
        if(ls.size()>2){
            ls.put(f[left],ls.getOrDefault(f[left],0)-1);
            if(ls.get(f[left])==0)ls.remove(f[left]);
            left++;
        }
        max=Math.max(max,i-left+1);
      }
      return max;
    }
}