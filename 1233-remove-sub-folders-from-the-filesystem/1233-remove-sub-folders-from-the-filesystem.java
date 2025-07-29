class Solution {
    public List<String> removeSubfolders(String[] f) {
        Arrays.sort(f);
        int n=f.length;
        HashSet<String> ls=new HashSet<>();
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(String s:ls){
                if(f[i].startsWith(s+"/")){
                    flag=true;
                    break;
                }
            }
            if(!flag)ls.add(f[i]);
        }
        ArrayList<String> l=new ArrayList<>();
       for(String s:ls)l.add(s);
        return l;
    }
}