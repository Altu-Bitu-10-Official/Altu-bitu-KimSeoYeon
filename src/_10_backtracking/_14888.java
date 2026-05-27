package _10_backtracking;

import java.io.*;
import java.util.*;

public class _14888 {
    static int N;
    static int A[];
    static int min;
    static int max;
    static int add, sub, mult, div;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        A = new int[N];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        // + , - , X , /
        st = new StringTokenizer(br.readLine());
        add = Integer.parseInt(st.nextToken());
        sub = Integer.parseInt(st.nextToken());
        mult = Integer.parseInt(st.nextToken());
        div = Integer.parseInt(st.nextToken());

        bt(1, A[0]);

        System.out.println(max);
        System.out.println(min);
    }

    static void bt(int d, int sum){
        if (d == N) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        if (add > 0) {
            add--;
            bt(d + 1, sum + A[d]);
            add++;
        }
        if (sub > 0) {
            sub--;
            bt(d + 1, sum - A[d]);
            sub++;
        }
        if (mult > 0) {
            mult--;
            bt(d + 1, sum * A[d]);
            mult++;
        }
        if (div > 0) {
            div--;
            bt(d + 1, sum / A[d]);
            div++;
        }
    }
}