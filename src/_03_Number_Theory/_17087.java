package _03_Number_Theory;

import java.util.*;
import java.io.*;
import java.math.*;

public class _17087 {
    public static int GCD(int a,int b){
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        //수빈이와 동생 사이의 거리는 반드시 D의 배수여야함..
        int N = Integer.parseInt(st.nextToken()); // 동생수
        int S = Integer.parseInt(st.nextToken()); // 수빈 위치

        int[] d = new int[N]; //동생들 위치

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int b = Integer.parseInt(st.nextToken());
            d[i] = Math.abs(S - b);
        }

        int gcd = d[0];
        for(int i = 1; i< d.length; i++){
            gcd = GCD(gcd,d[i]);
        }
        System.out.println(gcd);


    }
}
