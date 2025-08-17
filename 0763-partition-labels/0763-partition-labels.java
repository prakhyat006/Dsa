class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> hs=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
        hs.put(s.charAt(i),i);
        }
        List<Integer> ls=new ArrayList<>();
        int prev=-1;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,hs.get(s.charAt(i)));
            if(max==i){
                ls.add(max-prev);
                prev=max;
            }
        }
        return ls;
    }
}