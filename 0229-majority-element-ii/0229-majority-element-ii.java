class Solution {
    public List<Integer> majorityElement(int[] nums) {
     List<Integer> ls=new ArrayList<>();
     HashMap<Integer,Integer> hs=new HashMap<>();
       for(Integer c:nums){
        hs.put(c,hs.getOrDefault(c,0)+1);
       }
       int n=nums.length/3;
       for(Map.Entry<Integer,Integer> entry:hs.entrySet()){
        if(entry.getValue()>n)ls.add(entry.getKey());
       }  
    
    return ls;
}
}