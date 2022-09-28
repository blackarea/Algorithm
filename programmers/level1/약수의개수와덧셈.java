package algorithm.programmers.level1;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {

        solution(13, 17);
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
