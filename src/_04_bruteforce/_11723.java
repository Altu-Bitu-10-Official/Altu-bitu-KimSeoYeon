package _04_bruteforce;

import java.util.*;
import java.io.*;

public class _11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        boolean[] s = new boolean[21];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            int n = 0;

            if (!S.equals("all") && !S.equals("empty")) {
                n = Integer.parseInt(st.nextToken());
            }


            switch (S) {
                case "add":
                    s[n] = true;
                    break;
                case "remove":
                    s[n] = false;
                    break;
                case "check":
                    sb.append(s[n] ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    s[n] = !s[n];
                    break;
                case "all":
                    Arrays.fill(s, true);
                    break;
                case "empty":
                    Arrays.fill(s, false);
                    break;
            }
        }
        System.out.print(sb);
    }
}