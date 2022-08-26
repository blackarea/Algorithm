package algorithm.programmers.level1;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {

        solution(118372);
    }

    public static long solution(long n) {
        long answer = 0;
        int[] arr = new int[10];

        while (n != 0) {
            arr[(int) (n % 10)]++;
            n /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            while (arr[i] > 0) {
                answer += i;
                answer *= 10;
                arr[i]--;
            }
        }

        return answer / 10;
    }
}
