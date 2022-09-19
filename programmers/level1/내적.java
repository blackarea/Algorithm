package algorithm.programmers.level1;

import java.util.Arrays;

public class 내적 {
    public static void main(String[] args) {

        solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
    }

    public static int solution(int[] a, int[] b) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        System.out.println(sum);

        return sum;
    }
}
