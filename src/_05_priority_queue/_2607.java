package _05_priority_queue;

import java.io.*;
import java.util.*;

public class _2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String firstWord = br.readLine();
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            String targetWord = br.readLine();
            if (compare(firstWord, targetWord)) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean compare(String a,String b){
        if (Math.abs(a.length() - b.length()) > 1) return false;
        int[] alphabet = new int[26];
        for (int i = 0; i < a.length(); i++) {
            alphabet[a.charAt(i) - 'A']++;
        }

        int sameCount = 0;
        for (int i = 0; i < b.length(); i++) {
            if (alphabet[b.charAt(i) - 'A'] > 0) {
                sameCount++;
                alphabet[b.charAt(i) - 'A']--;
            }
        }


        if (a.length() == b.length()) {
            return sameCount == a.length() || sameCount == a.length() - 1;
        }
        else if (a.length() == b.length() + 1) {
            return sameCount == b.length();
        }
        else if (a.length() == b.length() - 1) {
            return sameCount == a.length();
        }

        return false;
    }
}
