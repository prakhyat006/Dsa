class Solution {
    public int kthSmallest(int[][] m, int k) {
        PriorityQueue<Integer> ls=new PriorityQueue<>();
        int n=m.length;
        int z=m[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<z;j++){
                ls.offer(m[i][j]);
            }
        }
        for(int i=1;i<k;i++)ls.poll();
        return ls.peek();
    }
}