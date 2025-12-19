class Solution {

    public static int count(int[] edges, int start, int[] gV) {
        int curr = start;
        int step = 0;

        Map<Integer, Integer> V = new HashMap<>();

        while(curr != -1 && gV[curr] == 0){
            V.put(curr, step++);
            gV[curr] = 1;
            curr = edges[curr];
            if(curr!=-1 && V.containsKey(curr)){
                return step - V.get(curr);
            }
        }
        return -1;
    }

    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] gV = new int[n];
        int ans = -1;

        for(int i=0; i<n; i++){
            if(gV[i] == 0){
                ans = Math.max(ans, count(edges, i,gV));
            }
        }
        return ans;
    }
}
