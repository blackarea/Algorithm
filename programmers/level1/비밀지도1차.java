package algorithm.programmers.level1;

import java.util.Arrays;

public class 비밀지도1차 {
    public static void main(String[] args) {

        solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[] total = new int[n];

        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            total[i] = arr1[i] | arr2[i];

            for (int j = (int)Math.pow(2, n - 1); j > 0; j>>=1) {
                if((total[i] & j) == j){
                    temp.append("#");
                }else {
                    temp.append(" ");
                }
            }
            answer[i] = temp.toString();
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
