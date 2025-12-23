package algo;

import java.util.ArrayList;
import java.util.List;

public class GraphDFS01 {
    static List<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int next : graph[v]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);

        dfs(0);
    }
}
