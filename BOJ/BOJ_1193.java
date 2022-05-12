package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class BOJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int sum = 0;
        int first, second;

        int i = 1;
        while (sum + i < x) {
            sum += i++;
        }

        if (i % 2 == 0) {
            first = x - sum;
            second = i - (x - sum) + 1;
        } else {
            first = i - (x - sum) + 1;
            second = x - sum;
        }

        System.out.println(first + "/" + second);
    }
}
