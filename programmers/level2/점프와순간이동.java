package algorithm.programmers.level2;

public class 점프와순간이동 {
    public static void main(String[] args) {

        solution(5000);
    }

    public static int solution(int n) {
        int ans = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                ans++;
            }
            n /= 2;
        }
        System.out.println(ans);

        return ans;
    }
}
