class Solution {
    private int soldiers(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int c=0;      
            arr[i]=soldiers(mat[i]);
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