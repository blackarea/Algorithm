package algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 같은숫자는싫어 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (temp != arr[i]) {
                temp = arr[i];
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
