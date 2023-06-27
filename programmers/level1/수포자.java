package algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 수포자 {
    public static void main(String[] args) {

        solution(new int[]{1, 3, 2, 4, 2});
    }

    public static int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};

        int[] supoza1 = new int[]{1, 2, 3, 4, 5};
        int[] supoza2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoza3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supoza1[i % 5]) {
                answer[0]++;
            }
            if (answers[i] == supoza2[i % 8]) {
                answer[1]++;
            }
            if (answers[i] == supoza3[i % 10]) {
                answer[2]++;
            }
        }

        int max = Arrays.stream(answer).max().getAsInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == max) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
