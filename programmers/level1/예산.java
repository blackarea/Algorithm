package algorithm.programmers.level1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {

        solution(new int[]{1,3,2,4,5}, 9);
    }

    public static int solution(int[] d, int budget) {
        int result = 0;

        Arrays.sort(d);
        for (int i : d) {
            budget -= i;
            if(budget < 0){
                break;
            }
            result++;
        }

        return result;
    }
}
