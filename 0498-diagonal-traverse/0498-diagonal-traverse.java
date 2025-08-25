import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Collect elements grouped by diagonal (i + j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map.computeIfAbsent(i + j, k -> new ArrayList<>()).add(mat[i][j]);
            }
        }

        List<Integer> res = new ArrayList<>();
        int level = 0;

        // Process diagonals in order
        for (int k = 0; k <= n + m - 2; k++) {
            List<Integer> list = map.get(k);
            if (list == null) continue;

            if (level % 2 == 0) {
                Collections.reverse(list);
            }
            res.addAll(list);
            level++;
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
