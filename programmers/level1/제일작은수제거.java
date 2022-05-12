package algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 제일작은수제거 {
    public static void main(String[] args) {

        solution(new int[]{1,2});
    }
    public static int[] solution(int[] arr) {
        int[] answer = {};

        if(arr.length == 1){
            return new int[]{-1};
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = Collections.min(list);

        return list.stream().filter(i -> i != min).mapToInt(i -> i).toArray();
    }
}
