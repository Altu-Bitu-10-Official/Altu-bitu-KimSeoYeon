package _09_dfs_bfs;

import java.util.*;
import java.io.*;

public class _2615 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(br.readLine());

        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            g[x].add(y);
            g[y].add(x);
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[n + 1];

        Arrays.fill(distance, -1);

        queue.add(a);
        distance[a] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == b) {
                break;
            }

            for (int next : g[current]) {
                if (distance[next] == -1) {
                    distance[next] = distance[current] + 1;
                    queue.add(next);
                }
            }
        }

        System.out.println(distance[b]);
    }
}