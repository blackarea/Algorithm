package algorithm.programmers.level1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 명예의전당1 {
    public static void main(String[] args) {

        solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //우선순위 큐를 이용하면 가독성 좋은 코드 작성 가능
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if(pq.size() > k){
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
