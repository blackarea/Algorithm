package algorithm.BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1850 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;// new StringTokenizer(br.readLine()); //st.nextToken()

        st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcd(a, b); i++) {
            sb.append('1');
        }
        System.out.println(sb);

    }

    public static long gcd(long a, long b) {

        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
