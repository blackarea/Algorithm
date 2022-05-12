package algorithm.BOJ;

import java.io.*;

public class BOJ_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String temp = Integer.toBinaryString(str.charAt(i));
            while(temp.length()!=3 && i > 0){
                temp = "0"+temp;
            }
            sb.append(temp);

        }
        System.out.println(sb);

    }
}
