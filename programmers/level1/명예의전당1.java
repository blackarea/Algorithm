package algorithm.programmers.level1;

import java.util.Arrays;

public class 명예의전당1 {
    public static void main(String[] args) {

        solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hallOfFame = new int[k];

        for (int i = 0; i < score.length; i++) {
            if(i < k){
                hallOfFame[0] = score[i];
            }else {
                if(hallOfFame[0] < score[i]){
                    hallOfFame[0] = score[i];
                }
            }
            Arrays.sort(hallOfFame);
            answer[i] = hallOfFame[i < k ? k - i - 1 : 0];
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
