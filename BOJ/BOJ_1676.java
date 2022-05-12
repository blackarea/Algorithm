package algorithm.BOJ;

import java.io.*;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        while(N >=5){
            sum += N/5;
            N/=5;
        }
        System.out.println(sum);

    }
}
