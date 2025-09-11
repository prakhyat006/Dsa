class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> v=new ArrayList<>();
         String vowels = "aeiouAEIOU";
        int n=s.length();
        for(int i=0;i<n;i++){
            if (vowels.indexOf(s.charAt(i))!= -1){
                v.add(s.charAt(i));
            } 
        }
        int j=0;
        Collections.sort(v);
        String ans="";
        for(int i=0;i<n;i++){
            if (vowels.indexOf(s.charAt(i))!= -1){
                ans=ans + v.get(j++);
            } else ans=ans+s.charAt(i);
        }
        return ans;
    }
}