class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] tr) {
        Arrays.sort(p);
        Arrays.sort(tr);
        int n=p.length;
        int m=tr.length;
        int i=0;
        int j=0;
        int c=0;
        while(i<n&&j<m){
            if(p[i]<=tr[j]){
                i++;
                j++;
                c++;
            }else j++;
        }
        return c;
     }
}