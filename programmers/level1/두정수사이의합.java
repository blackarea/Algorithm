package algorithm.programmers.level1;

public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
    }
    public static long solution(int a, int b) {
        long answer = 0;
        if(a == b){
            return a;
        }
        if(a > b){
            int temp = b;
            b = a;
            a = temp;
        }

        answer = (long) (b - a + 1) * (a + b) / 2;
        return answer;
    }
}
