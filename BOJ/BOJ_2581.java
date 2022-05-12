package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 99999;

        for (int i = m; i <= n; i++) {
            //소수판별
            if(primeNumber(i)){
                //맞으면 덧셈
                sum += i;
                if(min > i){
                    min = i;
                }
            }

        }
        if(sum == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean primeNumber(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
