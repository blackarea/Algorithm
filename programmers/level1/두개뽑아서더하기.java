package algorithm.programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,0,2,7})));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        Iterator itor = set.iterator();
        int index = 0;
        while(itor.hasNext()){
            answer[index] = (int)itor.next();
            index++;
        }
        return answer;
    }
}
