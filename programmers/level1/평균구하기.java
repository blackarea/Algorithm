package algorithm.programmers.level1;

public class 평균구하기 {
    public static void main(String[] args) {

    }

    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        answer = sum/arr.length;
        return answer;
    }
}
