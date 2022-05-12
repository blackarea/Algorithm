package algorithm.BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int netPro = c - b;
        if(netPro <= 0){
            bw.write("-1");
        }else{
            bw.write(String.valueOf((a/(netPro))+1));
        }

        bw.flush();
        bw.close();

    }
}
