package algorithm.programmers.level1;

import java.util.Arrays;

public class 가장가까운같은글자 {
    public static void main(String[] args) {

        solution("banana");
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i) - 'a';
            if (alphabet[current] == 0) {
                answer[i] = -1;
            }
            else {
                answer[i] = i + 1 - alphabet[current];
            }
            alphabet[current] = i + 1;
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
