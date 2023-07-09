package algorithm.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {
    public static void main(String[] args) {

        solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < choices.length; i++) {
            if (choices[i] < 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
            } else if (choices[i] > 4) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
            }
        }
        answer += map.get('R') < map.get('T') ? "T" : "R";
        answer += map.get('C') < map.get('F') ? "F" : "C";
        answer += map.get('J') < map.get('M') ? "M" : "J";
        answer += map.get('A') < map.get('N') ? "N" : "A";

        System.out.println(map);
        System.out.println(answer);

        return answer;
    }
}
