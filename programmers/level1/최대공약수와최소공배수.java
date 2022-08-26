package algorithm.programmers.level1;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        solution(2, 5);
    }

    public static int[] solution(int a, int b) {
        int min = Math.min(a, b);
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return new int[]{gcd, a * b / gcd};
    }
}
