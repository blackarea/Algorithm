package algorithm.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {
    public static void main(String[] args) {

        solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"});
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        /**
         * 이 문제에서 map을 쓰지 않고 array를 쓰는게 더 빠르다. (프로그래머스 기준)
         * 이유는 데이터 수가 워낙 적기 때문.
         */
        Map<Character, Integer> map = new HashMap<>();

        for (String str : keymap) {
            for (int i = 0; i < str.length(); i++) {
                if(!map.containsKey(str.charAt(i)) || i < map.get(str.charAt(i))){
                    map.put(str.charAt(i), i);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if(!map.containsKey(targets[i].charAt(j))){
                    answer[i] = -1;
                    break;
                }

                answer[i] += map.get(targets[i].charAt(j));
            }
        }

        return answer;
    }
}
