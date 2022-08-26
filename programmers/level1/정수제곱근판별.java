package algorithm.programmers.level1;

public class 정수제곱근판별 {
    public static void main(String[] args) {

        solution(3);
    }

    public static long solution(long n) {
        if((Math.sqrt(n) % 1) != 0){
            return -1;
        }

        return (long) Math.pow(Math.sqrt(n) + 1, 2);
    }
}
