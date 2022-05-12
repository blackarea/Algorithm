package algorithm.BOJ10k;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_16208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long [] arr = new long[n];
        long total = 0;
        long price = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            total -= arr[i];
            price += total * arr[i];
        }
        System.out.println(price);
    }
}
