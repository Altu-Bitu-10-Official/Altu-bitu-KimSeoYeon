package _05_priority_queue;

import java.util.*;
import java.io.*;

public class _2705 {
    static int dp[] = new int[1001];
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        StringTokenizer st;

        dp[0] = 1;
        dp[1] = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(pal(n)).append("\n");
        }
        System.out.print(sb);

    }
    public static int pal(int n){
        if(dp[n]>0) return dp[n];
        int result =1;

        for (int m = 1; m <= n / 2; m++) {
            result += pal(m);
        }

        return dp[n]=result;
    }
}
