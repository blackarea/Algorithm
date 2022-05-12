package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int a_x = (a - 1) / 4;
        int a_y = a % 4;
        a_y = a_y == 0 ? 4 : a_y;

        int b_x = (b - 1) / 4;
        int b_y = b % 4;
        b_y = b_y == 0 ? 4 : b_y;

        System.out.println(Math.abs(b_x - a_x) +Math.abs(b_y - a_y));

    }
}
