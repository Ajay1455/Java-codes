package practice;

import java.util.*;

public class GraphPractice {

    HashMap<Integer, HashMap<Integer, Integer>> grph = new HashMap<>();

    public GraphPractice(int v) {
        for (int i = 1; i <= v; i++) {
            grph.put(i, new HashMap<>());
        }
    }

    public void addVertex(int v) {
        grph.put(v, new HashMap<>());
    }

    public void addEdge(int v, int u, int weight) {
        grph.get(v).put(u, weight);
        grph.get(u).put(v, weight);
    }

    public boolean containEdge(int v, int e) {
        return grph.get(v).containsKey(e);
    }

    public boolean containVertex(int v) {
        return grph.containsKey(v);
    }

    public int getEdge(int v, int e) {
        return grph.get(v).get(e);
    }

    public void removeVertex(int v, int u) {
        for (int i : grph.keySet()) {
            for (int j : grph.get(i).keySet()) {
                grph.get(i).remove(j);
            }
        }
    }

    public void hashPath(int src, int dest) {
        HashSet<Integer> visited = new HashSet<>();

        if (hasPath(src, dest, visited)) {
            System.out.println("hash path");
        }
        System.out.println("no path");
    }

    private boolean hasPath(int src, int dest, HashSet<Integer> visited) {
        if (src == dest)
            return true;

        visited.add(src);
        for (int i : grph.get(src).keySet()) {
            if (!visited.contains(i)) {
                boolean ans = hasPath(i, dest, visited);
                if (ans)
                    return true;
            }
        }
        return false;
    }

    public boolean bfs(int src, int dest) {
        ArrayList<Integer> queue = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(src);

        while (!queue.isEmpty()) {
            int x = queue.remove(0);

            if (visited.contains(x))
                continue;

            visited.add(x);

            if (x == dest) {
                return true;
            }

            for (int key : grph.get(x).keySet()) {
                queue.add(key);
            }

        }
        return false;
    }

    public void bft() {
        LinkedList<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : grph.keySet()) {
            if (visited.contains(src)) {
                continue;
            }

            queue.add(src);
            while (!queue.isEmpty()) {
                int x = queue.remove();

                if (visited.contains(x))
                    continue;

                visited.add(x);

                System.out.print(x + " -> ");

                for (int key : grph.get(x).keySet()) {
                    if (!visited.contains(key)) {
                        queue.add(key);
                    }
                }
            }
        }
        System.out.println();
    }

    public boolean dfs(int src, int dest) {
        Stack<Integer> stck = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        stck.push(src);
        while (!stck.isEmpty()) {
            int x = stck.pop();

            if (visited.contains(x))
                continue;

            visited.add(x);

            if (x == dest)
                return true;

            for (int key : grph.get(x).keySet()) {
                if (!visited.contains(key)) {
                    stck.push(key);
                }
            }
        }
        return false;
    }

    public void dft() {
        Stack<Integer> stck = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int src : grph.keySet()) {
            if (visited.contains(src))
                continue;

            stck.push(src);

            while (!stck.isEmpty()) {
                int x = stck.pop();

                if (visited.contains(x))
                    continue;

                visited.add(x);

                System.out.print(x + " -> ");

                for (int key : grph.get(x).keySet()) {
                    if (!visited.contains(key)) {
                        stck.push(key);
                    }
                }
            }
        }
        System.out.println();
    }

    public void bfsShortestPath(int source) {

        int V = grph.keySet().size();

        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> dist = new HashMap<>();
        Map<Integer, Integer> parent = new HashMap<>();
        q.add(source);
        for (int i = 0; i < V; i++) {
            dist.put(i, Integer.MAX_VALUE);
        }
        dist.put(source, 0);
        parent.put(source, source);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int child : grph.get(node)) {
                if (dist.get(child) == Integer.MAX_VALUE) {
                    q.add(child);
                    dist.put(child, dist.get(node) + 1);
                    parent.put(child, node);
                }
            }
        }
        for (int i = 0; i < V; i++) {
            if (dist.get(i) == Integer.MAX_VALUE) {
                System.out.print("-1 ");
            } else if (dist.get(i) == 0) {
            } else {
                System.out.print(6 * dist.get(i) + " ");
            }
        }
    }

    public boolean CycleDetect() {
        Stack<Integer> stck = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int src : grph.keySet()) {
            if (!visited.contains(src))
                stck.push(src);

            while (!stck.isEmpty()) {
                int x = stck.pop();

                if (visited.contains(x))
                    return true;

                visited.add(x);

                for (int key : grph.get(x).keySet()) {
                    if (!visited.contains(key)) {
                        stck.push(key);
                    }
                }

            }
        }
        return true;
    }

    public boolean isConnected() {
        LinkedList<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        int intial = grph.keySet().iterator().next();
        queue.add(intial);

        while (!queue.isEmpty()) {
            int current = queue.remove();
            if (!visited.contains(current)) {

                visited.add(current);

                for (int key : grph.get(current).keySet()) {
                    if (!visited.contains(key)) {
                        queue.add(key);
                    }
                }
            }
        }
        return visited.size() == grph.keySet().size();
    }

    public int allPath(int v, int u) {
        return app(v, u, new HashSet<>());
    }

    public int app(int v, int u, HashSet<Integer> visited) {
        if (v == u) {
            return 1;
        }

        int count = 0;
        visited.add(v);

        for (int key : grph.get(v).keySet()) {
            if (!visited.contains(key)) {
                count += app(key, u, visited);
            }
        }
        visited.remove(v);
        return count;
    }

    public void dfsHelper(long node, Map<Long, Boolean> visited) {

        visited.put(node, true);

        for (long child : adjList.get(node)) {

            if (!visited.get(child)) {

                dfsHelper(child, visited);

            }

        }

    }

    public long dfsReligiousPeople(long src, long a, long b) {

        int V = grph.keySet().size();

        if (a <= b) {

            return V * a;

        }

        Map<Long, Boolean> visited = new HashMap<>();

        for (long i = 1; i <= V; i++) {

            visited.put(i, false);

        }

        long components = 1;

        dfsHelper(src, visited);

        for (long city : adjList.keySet()) {

            if (!visited.get(city)) {

                dfsHelper(city, visited);

                components++;

            }

        }

        long n = adjList.size();

        long totalCost = a * components + b * (n - components) + a * (V - n);

        return totalCost;

    }

    static void dijkstra(int[][] graph, int src, int n) {

        int[] dist = new int[n];

        Boolean[] sptSet = new Boolean[n];

        for (int i = 0; i < n; i++) {

            dist[i] = Integer.MAX_VALUE;

            sptSet[i] = false;

        }

        dist[src] = 0;

        for (int count = 0; count < n - 1; count++) {

            int u = minDistance(dist, sptSet, n);

            sptSet[u] = true;

            for (int v = 0; v < n; v++) {

                if (!sptSet[v] && graph[u][v] != 0 &&

                        dist[u] != Integer.MAX_VALUE &&

                        dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];

                }

            }

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            if (i == src)
                continue;

            sb.append(dist[i] == Integer.MAX_VALUE ? -1 : dist[i]);

            sb.append(" ");

        }

        System.out.println(sb.toString());

    }

    static int minDistance(int[] dist, Boolean[] sptSet, int n) {

        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < n; v++) {

            if (!sptSet[v] && dist[v] <= min) {

                min = dist[v];

                min_index = v;

            }

        }

        return min_index;

    }

    public static void main(String[] args) {
        GraphPractice gp = new GraphPractice(7);

        gp.addEdge(1, 2, 6);
        gp.addEdge(1, 3, 5);
        gp.addEdge(2, 4, 8);
        gp.addEdge(2, 5, 9);
        gp.addEdge(3, 4, 1);
        gp.addEdge(4, 6, 3);
        gp.addEdge(5, 6, 2);
        gp.addEdge(5, 7, 1);
        gp.addEdge(6, 7, 6);

        // System.out.println(gp.bfs(1, 7));
        // gp.bft();

        // System.out.println(gp.dfs(1, 7));
        // gp.dft();

        System.out.println("Graph Contain Cycle -> " + gp.CycleDetect());

        System.out.println("Graph is connected -> " + gp.isConnected());

        System.out.println("All possible Path -> " + gp.allPath(1, 7));

    }
}
