package algorithm.programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

public class K번째수 {
    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        for (int i = 0; i < commands.length; i++) {
            List<Integer> newList = new ArrayList<>(list.subList(commands[i][0] - 1, commands[i][1]));
            Collections.sort(newList);
            answer[i] = newList.get(commands[i][2] - 1);
        }

        return answer;
    }
}
