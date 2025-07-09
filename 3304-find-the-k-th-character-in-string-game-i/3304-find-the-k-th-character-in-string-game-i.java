class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer > ls=new HashMap<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            ls.put(arr[i],ls.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> e:ls.entrySet()){
            if(e.getKey()==e.getValue()){
                ans=e.getKey();
            }
        }
        return ans;
    }
}