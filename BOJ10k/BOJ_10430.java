package algorithm.BOJ10k;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int A, B, C;
        int[] arr = new int[4];

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr[0] = (A + B) % C;
        arr[1] = ((A % C) + (B % C)) % C;
        arr[2] = (A * B) % C;
        arr[3] = ((A % C) * (B % C)) % C;

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
