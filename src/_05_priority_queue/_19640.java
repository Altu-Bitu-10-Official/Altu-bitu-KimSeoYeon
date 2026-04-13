package _05_priority_queue;

import java.util.*;
import java.io.*;

public class _19640 {

    static class Employee implements Comparable<Employee> {
        int d, h, line, idx;
        boolean isDeca;

        public Employee(int d, int h, int line, int idx, boolean isDeca) {
            this.d = d;
            this.h = h;
            this.line = line;
            this.idx = idx;
            this.isDeca = isDeca;
        }


        @Override
        public int compareTo(Employee o) {
            if (this.d != o.d) return o.d - this.d;
            if (this.h != o.h) return o.h - this.h;
            return this.line - o.line;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        Queue<Employee>[] lines = new LinkedList[m];
        for (int i = 0; i < m; i++) lines[i] = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            lines[i % m].add(new Employee(d, h, i % m, i, i == k));
        }

        PriorityQueue<Employee> pq = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            if (!lines[i].isEmpty()) {
                pq.add(lines[i].poll());
            }
        }

        int count = 0;
        while (!pq.isEmpty()) {
            Employee cur = pq.poll();

            if (cur.isDeca) {
                System.out.println(count);
                break;
            }

            count++;

            if (!lines[cur.line].isEmpty()) {
                pq.add(lines[cur.line].poll());
            }
        }
    }
}