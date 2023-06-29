package algorithm.programmers.level1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {

        solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{31, 10, 45, 1, 6, 19});
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int sameCount = 0;
        int zeroCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    sameCount++;
                }
            }
        }
        answer[0] = 7 - sameCount - zeroCount;
        answer[1] = 7 - sameCount;
        if (answer[0] == 7) {
            answer[0] = 6;
        }
        if (answer[1] == 7) {
            answer[1] = 6;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
