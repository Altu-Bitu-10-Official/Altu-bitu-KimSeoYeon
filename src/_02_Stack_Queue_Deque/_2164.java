package _02_Stack_Queue_Deque;

import java.util.*;

public class _2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            queue.poll();
            int nextCard = queue.poll();
            queue.add(nextCard);
        }

        System.out.println(queue.poll());
    }
}