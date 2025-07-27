class Item {
    int node;
    int weight;

    Item(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class Solution {
    public int networkDelayTime(int[][] edges,int V,  int src) {
        // Step 1: Build adjacency list
        Map<Integer, List<Item>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(new Item(edge[1], edge[2]));
            // graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(new Item(edge[0], edge[2])); 
        }

        // Step 2: Use PriorityQueue for optimal Dijkstra
        PriorityQueue<Item> q = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));
        int[] dist = new int[V+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        q.offer(new Item(src, 0));

        // Step 3: Dijkstra algorithm
        while (!q.isEmpty()) {
            Item check = q.poll();

            if (!graph.containsKey(check.node)) continue;

            for (Item neighbor : graph.get(check.node)) {
                int newDist = check.weight + neighbor.weight;
                if (newDist < dist[neighbor.node]) {
                    dist[neighbor.node] = newDist;
                    q.offer(new Item(neighbor.node, newDist));
                }
            }
        }
        int max=0;
        for(int i=1;i<dist.length;i++)max=Math.max(max,dist[i]);
        return max==2147483647?-1:max;
    }
}