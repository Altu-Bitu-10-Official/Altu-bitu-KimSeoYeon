package _06_greedy;

import java.util.*;

public class _15662 {
    static int T;
    static int[][] gears;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        gears = new int[T][8];

        for (int i = 0; i < T; i++) {
            String line = sc.next();
            for (int j = 0; j < 8; j++) {
                gears[i][j] = line.charAt(j) - '0';
            }
        }

        int K = sc.nextInt();
        while (K-- > 0) {
            int num = sc.nextInt() - 1;
            int dir = sc.nextInt();

            int[] directions = new int[T];
            directions[num] = dir;


            for (int i = num - 1; i >= 0; i--) {
                if (gears[i][2] != gears[i + 1][6]) {
                    directions[i] = -directions[i + 1];
                } else break;
            }

            for (int i = num + 1; i < T; i++) {
                if (gears[i][6] != gears[i - 1][2]) {
                    directions[i] = -directions[i - 1];
                } else break;
            }

            for (int i = 0; i < T; i++) {
                if (directions[i] != 0) {
                    rotate(i, directions[i]);
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < T; i++) {
            if (gears[i][0] == 1) answer++;
        }
        System.out.println(answer);
    }


    static void rotate(int idx, int dir) {
        if (dir == 1) {
            int temp = gears[idx][7];
            for (int i = 7; i > 0; i--) gears[idx][i] = gears[idx][i - 1];
            gears[idx][0] = temp;
        } else {
            int temp = gears[idx][0];
            for (int i = 0; i < 7; i++) gears[idx][i] = gears[idx][i + 1];
            gears[idx][7] = temp;
        }
    }
}
