class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        // Step 1: Put values in PQ according to diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int key = i - j;
                map.computeIfAbsent(key, k -> {
                    if (k < 0) {
                        // ascending (min-heap)
                        return new PriorityQueue<>();
                    } else {
                        // descending (max-heap)
                        return new PriorityQueue<>((a, b) -> b - a);
                    }
                }).add(grid[i][j]);
            }
        }

        // Step 2: Refill the grid from PQ
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int key = i - j;
                grid[i][j] = map.get(key).poll();
            }
        }

        return grid;
    }
}
