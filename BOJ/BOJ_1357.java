package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        System.out.println(rev(rev(x)+rev(y)));
    }

    public static int rev(int n){
        String s = String.valueOf(n);
        StringBuffer sb = new StringBuffer(s);
        String rvs = sb.reverse().toString();

        return Integer.parseInt(rvs);
    }
}
