class Solution {
    public int numberOfBeams(String[] bank) {
      int n=bank.length;
      int p=0;
      int ans=0;
      for(int i=0;i<n;i++){
        int co=0;
        for (char c : bank[i].toCharArray()) {  // ✅ should be 'char', not 'Char'
                if (c == '1') co++;
            }
        if(co>0){
            ans +=p*co;
            p=co;
        }
      }
      return ans;
    }
}