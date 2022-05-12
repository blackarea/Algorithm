package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        int sum = 0;
        for (int i = a; i <= b; i++) {
            int n = 1;
            int tmp = i;
            while (tmp - n > 0) {
                tmp -= n++;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}
