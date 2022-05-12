package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int a = 1;
        int b = 1;
        int c = 1;
        int sum = 1;

        while (!((a == e) && (b == s) && (c == m))) {

            a++;
            b++;
            c++;
            sum++;

            if (a == 16)
                a = 1;
            if (b == 29)
                b = 1;
            if (c == 20)
                c = 1;
        }
        System.out.println(sum);

    }
}
