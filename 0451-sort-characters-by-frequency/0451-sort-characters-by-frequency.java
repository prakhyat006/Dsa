class Solution {
    public String frequencySort(String s) {
         HashMap<Character,Integer> hs=new HashMap<>();
       for(Character c:s.toCharArray()){
        hs.put(c,hs.getOrDefault(c,0)+1);
       }  
      
       PriorityQueue <Map.Entry<Character,Integer>> p=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
       p.addAll(hs.entrySet());
      StringBuilder result = new StringBuilder();
      while(!p.isEmpty()){
        Map.Entry<Character,Integer> entry=p.poll();
        char ch =entry.getKey();
        int freq =entry.getValue();
        for (int i=0;i<freq;i++){
                result.append(ch);
        }}
       return result.toString();
    }
}