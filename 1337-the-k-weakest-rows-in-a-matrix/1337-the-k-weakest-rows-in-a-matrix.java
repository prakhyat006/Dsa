class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1)c++;
            }
            arr[i]=c;
        }
        PriorityQueue<Integer> ls = new PriorityQueue<>((i, j) -> {
        if(arr[i]==arr[j]) return  i-j;
        else return arr[i]-arr[j];
        });
        for(int i=0;i<n;i++){ 
            ls.offer(i);
        }
       int ans[]=new int[k];
       for(int i=0;i<k;i++){
        ans[i]=ls.poll();
       }
        return ans;
    }
}