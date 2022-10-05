package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int grade = Integer.parseInt(st.nextToken());
            max = Math.max(max, grade);
            sum += grade;
        }
        System.out.println(sum * 100 / max / n);
    }
}
