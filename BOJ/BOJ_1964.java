package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //System.out.println(pentagon(n, 0) % 45678);

        int sum = 0;
        for (int i = n; i > 1; i--) {
            sum += 4 + (i - 1) * 3;
            sum %= 45678;
        }
        System.out.println(sum+5);
    }

    //재귀함수쓰면 stackoverflow가 일어날수있음
    public static int pentagon(int n, int sum) {
        if (n == 1)
            return sum + 5;
        sum += 4 + (n - 1) * 3;
        sum %= 45678;
        return pentagon(n - 1, sum);
    }
}
