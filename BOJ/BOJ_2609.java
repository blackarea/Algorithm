package algorithm.BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int tempa = a;
        int tempb = b;

        while (tempb != 0) {
            int r = tempa % tempb;
            tempa = tempb;
            tempb = r;
        }

        System.out.println(tempa);
        System.out.println(a * b / tempa);
    }

}
