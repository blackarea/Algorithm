package algorithm.programmers.level1;

import java.util.Arrays;

public class x만큼간격 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(-4, 1)));
    }

    public static long[] solution(long x, int n) {
        long[] answer = new long[n];

        long temp = x;
        for (int i = 0; i < n; i++) {
            answer[i] = temp;
            temp += x;
        }

        return answer;
    }
}
