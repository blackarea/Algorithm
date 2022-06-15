package algorithm.programmers.level1;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 2, 2, 2, 2})));
    }

    public static int[] solution(int N, int[] stages) {
        int[] arr = new int[N + 2];
        for (int stage : stages) {
            arr[stage]++;
        }
        int user = stages.length;
        int clear = 0;
        Map<Integer, Double> map = new HashMap<>();

        
        //map에 삽입
        for (int i = 1; i < N + 1; i++) {
            if ((user - clear) != 0) {
                map.put(i, arr[i] / (double) (user - clear));
            } else {
                map.put(i, (double) 0);
            }
            clear += arr[i];
        }

        //정렬
        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, ((o1, o2) -> (map.get(o2).compareTo(map.get(o1)))));

        //출력
        int[] answer = new int[N];
        int i = 0;
        for (Integer key : keySetList) {
            answer[i++] = key;
        }

        return answer;
    }
}
