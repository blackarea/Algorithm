package algorithm.BOJ;

import java.io.*;

public class BOJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a;
        int b;
        int sum = 0;
        while (n > 0) {
            if (n >= 100) {
                a = n / 100 - ((n / 10) % 10);
                b = ((n / 10) % 10) - n % 10;
                if (a == b) {
                    sum++;
                }
                n--;
            } else {
                sum += n;
                break;
            }
        }
        System.out.println(sum);

    }
}
