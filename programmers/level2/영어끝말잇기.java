package algorithm.programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 영어끝말잇기 {
    public static void main(String[] args) {

        solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        Set<String> set = new HashSet<>();
        String temp = " " + words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i]) ||
                    !(temp.charAt(temp.length() - 1) == words[i].charAt(0))) {
                answer[0] = i % n + 1;
                answer[1] = (i + n) / n;
                break;
            }
            temp = words[i];
            set.add(words[i]);
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
