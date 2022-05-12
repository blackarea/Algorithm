package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a_x = Integer.parseInt(st.nextToken());
        int a_y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b_x = Integer.parseInt(st.nextToken());
        int b_y = Integer.parseInt(st.nextToken());

        int x, y;
        y = a_y * b_y;
        x = a_x * b_y + b_x * a_y;

        int mod = gcd(x, y);
        x /= mod;
        y /= mod;

        System.out.println(x + " " + y);
    }
    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b == 0) {
            return a;
        }
        return gcd(b , a % b);
    }
}
