package algorithm.BOJ10k;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); //st.nextToken()

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int temp = 0;
        for (int i = 0; i < m; i++) {
            temp += arr[i] * Math.pow(a, m-(i+1));
        }
        int result = 0;

        int[] resultArr = new int[m];
        int i = 0;
        while(temp > 0){
            result = temp%b;
            temp/=b;

            resultArr[i++]=result;
        }

        for (i = m - 1 ; i > -1; i--) {
            if(!(i == m - 1 && resultArr[i]==0)){
                System.out.print(resultArr[i]+ " ");
            }
        }
    }
}
