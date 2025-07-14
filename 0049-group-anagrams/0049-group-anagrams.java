class Solution {
    
    public List<List<String>> groupAnagrams(String[] s) {
        Map<String,ArrayList<String>> map=new HashMap<>();
        Arrays.sort(s);
        int i=0;
        int n=s.length;
        for(String word:s){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key))map.put(key,new ArrayList<>());
            map.get(key).add(word);

        }
        return new ArrayList<>(map.values());
    }
}