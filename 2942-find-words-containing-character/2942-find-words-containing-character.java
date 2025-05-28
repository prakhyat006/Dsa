class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            boolean count=false;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==x) {
                    count=true;
                    break;
                }
            }
           if(count) ls.add(i);
        }
        return ls;
    }
}