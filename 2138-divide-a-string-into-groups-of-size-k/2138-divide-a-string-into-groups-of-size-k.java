class Solution {
    public String[] divideString(String s, int d, char fill) {
        int n=s.length();
        List<String> ls=new ArrayList<>();
        int i=0,j=0;
        for(i=0,j=0;i<n-d;i=i+d,j++){
            ls.add(s.substring(i, i+d));
            System.out.println(j);
            System.out.println(ls);
        }
        if(i!=n){
            ls.add(s.substring(i,n));
            System.out.println(ls);
            while(ls.get(ls.size()-1).length()!=d){
                ls.set(ls.size()-1, ls.get(ls.size()-1)+fill);
            }
            System.out.println(ls);
        }
        String num[]=new String[ls.size()];
        for( i=0;i<ls.size();i++){
            num[i]=ls.get(i);
        }
        return num;
    }
}