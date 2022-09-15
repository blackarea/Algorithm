package algorithm.programmers.level1;

public class 약수의합 {
    public static void main(String[] args) {

        solution(0);
    }

    public static int solution(int n) {
        int sum = 0;
        double sqrt = Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i;
                sum += n / i;
            }
        }
        if(sqrt == (int) sqrt){
            sum -= sqrt;
        }
        return sum;
    }
}
