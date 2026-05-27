package _10_backtracking;

import java.util.*;
import java.io.*;

public class _15665 {
    static int N;
    static int M;
    static int n[];
    static int out[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N개의 자연수중에서 M개를 고른 수열
        N = Integer.parseInt(st.nextToken());
        M =  Integer.parseInt(st.nextToken());
        n = new int[N];
        out = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
           n[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(n);
        bt(0);
        System.out.print(sb);
    }
    public static void bt(int d){
        if(d==M){
            for(int i=0;i<M;i++){
                sb.append(out[i]).append(" ");
            }sb.append("\n");
            return;
        }

        int l = -1;
        for(int j=0;j<n.length;j++){
            if(n[j]==l) continue;

            out[d]=n[j];
            l=n[j];

            bt(d+1);
        }

    }


}
