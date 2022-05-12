package algorithm.BOJ10k;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp;
        while ((temp=br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(temp);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);

        }
    }
}
