package _03_Number_Theory;

import java.util.*;
import java.io.*;

public class _2840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //바퀴 칸의 수
        int k = Integer.parseInt(st.nextToken()); //상덕이가 바퀴 돌리는 횟수

        //Deque<Character> deque = new LinkedList<>();
        char n[] = new char[N];
        boolean[] bool = new boolean[N];
        int Index =0;

        for(int i = 0; i < N; i++){
            n[i] = '?';
        }

        for(int i=0;i<k;i++){
            // 바퀴 s만큼 돌리면 다음위치 -> (현재위치+s)%N
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);

            Index = (Index + p) % N;

            if(n[Index] == '?' && bool[c = 'A']){
                System.out.println("!");
                return;
            }
            bool[c = 'A'] = true;
            n[Index] = c;
            StringBuffer sb = new StringBuffer();
            for(int l =0;l<N;l++){
                //n[(Index - l + N*N)%N]하는 이유 = Index에서 l만큼 뒤로 가는데, 음수가 될 수 있으므로 N을 더해줌. N*N을 더하는 이유는 음수 방지용으로 충분히 큰 수를 더해주는 것...출처 블로그
                sb.append(n[(Index - l + N*N)%N]);
            }
            System.out.println(sb);

        }




    }
}
