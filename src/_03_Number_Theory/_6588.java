package _03_Number_Theory;

import java.io.*;
import java.util.*;

public class _6588 {
    public static boolean isprime(int n){
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static String test(int n) {
        for (int i = 3; i <= n / 2; i += 2) {
            if (isprime(i) && isprime(n - i)) {
                return n + " = " + i + " + " + (n - i) + "\n";
            }
        }
        return "Goldbach's conjecture is wrong.\n";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("0")) break;
            int n = Integer.parseInt(s);

            if (n >= 6 && (n % 2) == 0) {
                sb.append(test(n));
            }

        }
        System.out.println(sb);
        }

    }
