class Solution {
    private int binary(int[] arr) {
        int l= 0;
        int r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==1) l=m+1;
            else r=m-1;
        }
        return l;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int c=0;      
            arr[i]=binary(mat[i]);
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