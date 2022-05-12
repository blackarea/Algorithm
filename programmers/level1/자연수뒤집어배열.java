package algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 자연수뒤집어배열 {
    public static void main(String[] args) {

        int[] solution = solution(12345);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(long n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
