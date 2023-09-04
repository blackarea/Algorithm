package algorithm.programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {

        solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        int max = queue.peek();
        int value = 0;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            if (max < temp) {
                max = temp;
                list.add(value);
                value = 0;
            }
            value++;
        }
        list.add(value);
        System.out.println(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
