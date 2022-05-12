package algorithm.BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;
        int number = 0;

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) >= '0' && N.charAt(i) <= '9') {
                number = N.charAt(i)-'0';
            } else {
                number = N.charAt(i)-'A'+10;
            }
            sum += number * Math.pow(B , N.length() - (i+1));

        }

        System.out.println(sum);

    }
}
