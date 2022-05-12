package algorithm.BOJ;

import java.io.*;

public class BOJ_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int temp;

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i > -1 ; i-=3) {
            temp = 0;
            if(str.charAt(i) == '1'){
                temp+=1;
            }
            if(i >= 1 && str.charAt(i-1)=='1'){
                temp+=2;
            }
            if(i >= 2 && str.charAt(i-2)=='1'){
                temp+=4;
            }
            sb.append(temp);
        }
        System.out.println(sb.reverse());

    }
}
