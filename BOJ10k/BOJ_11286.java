package algorithm.BOJ10k;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if (first == second) {
                return o1 > o2 ? 1 : -1;
            } else {
                return first - second;
            }
        });

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x != 0) {
                pq.add(x);
            } else {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            }
        }
    }
}
