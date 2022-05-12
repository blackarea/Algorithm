package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class BOJ_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());

        /*c += d;
        b += c/60;
        c %= 60;
        a += b/60;
        b %= 60;
        a %= 24;*/

        /*if (c + d % 60 >= 60) {
            b++;
        }

        c += (d % 60);

        if (b +((d / 60) % 60) >= 60) {
            a++;
        }
        b += (d / 60) % 60;
        a += (d / 3600);*/

        System.out.println(a % 24 + " " + b % 60 + " " + c % 60);

    }
}
