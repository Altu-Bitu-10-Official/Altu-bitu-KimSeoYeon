package _03_Number_Theory;

import java.io.*;
import java.util.*;

public class _6588 {
    public static boolean[] isNotPrime = new boolean[1000001]; //에라토스체를 위한... 최대치 배열

    public static void calculate_prime() {
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!isNotPrime[i]) { //i가 소수면 i의 배수는 모두 소수가 아니니깐 ture
                for (int j = i * i; j <= 1000000; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }

    public static String test(int n) {
        for (int i = 3; i <= n / 2; i += 2) {
            if (!isNotPrime[i] && !isNotPrime[n - i]) {
                return n + " = " + i + " + " + (n - i) + "\n";
            }
        }
        return "Goldbach's conjecture is wrong.\n";
    }

    public static void main(String[] args) throws IOException {
        calculate_prime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("0")) break;
            int n = Integer.parseInt(s);

            sb.append(test(n));

        }
        System.out.println(sb);
        }

    }
