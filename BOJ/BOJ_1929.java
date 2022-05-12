package algorithm.BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[n];
        StringBuilder sb = new StringBuilder();

        prime[0] = prime[1] = true;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) continue;

            if (i >= m) sb.append(i + "\n");

            for (int j = i + i; j <= n; j += i) {
                prime[j] = true;
            }
        }
        System.out.println(sb);

    }
}
