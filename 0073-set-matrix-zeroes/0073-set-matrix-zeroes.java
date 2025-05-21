class Solution {
    public void setZeroes(int[][] m) {
        Set<Integer> r=new  HashSet<>();
        Set<Integer> c=new  HashSet<>();
        int n=m.length;
        int l=m[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                if(m[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i=0;i<n;i++){
            
            for(int j=0;j<l;j++){
                if(r.contains(i)||c.contains(j))m[i][j]=0;
            }
        }
        System.out.println(r+" "+c);
        
    }
}