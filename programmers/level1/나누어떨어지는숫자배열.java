package algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {

        solution(new int[]{5, 9, 7, 10}, 12);
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            if(n % divisor == 0){
                list.add(n);
            }
        }
        if(list.isEmpty()){
            return new int[]{-1};
        }

        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
