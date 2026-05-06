package _06_greedy;

import java.io.*;
import java.util.*;
import java.math.*;

public class _11941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int s[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }
        long v = s[n-1];

        for(int i = n-2;i>=0;i--){
            if(s[i]>v){
            v=s[i];}
            else if(s[i]<v&&v%s[i]!=0){
                v= (v/s[i]+1)*s[i];
            }
        }
        System.out.println(v);

    }
}
