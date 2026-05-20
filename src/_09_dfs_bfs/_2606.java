package _09_dfs_bfs;

import java.util.*;
import java.io.*;

public class _2606 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[n + 1];
        dfs(1);

        System.out.println(answer);
    }

    static void dfs(int now) {
        visited[now] = true;

        for (int next : graph[now]) {
             if (!visited[next]) {
                answer++;
                dfs(next);
            }
        }
    }
}