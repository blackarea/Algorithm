package algorithm.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        //solution(new int[]{1, 2}, 7);
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        while (pq.peek() < K) {
            if(pq.size() < 2){
                return -1;
            }
            if (pq.peek() < K) {
                pq.add(pq.poll() + pq.poll() * 2);
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
