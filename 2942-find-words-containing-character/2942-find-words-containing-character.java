class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ls=new ArrayList<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==x) 
                    count++;
            }
           if(count>0) ls.add(i);
           count=0;
        }
        return ls;
    }
}