package algorithm.BOJ;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int sum = 0;
        int temp = a;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(a);

        while (true) {
            while (temp > 0) {
                sum += Math.pow(temp % 10, p);
                temp /= 10;
            }
            if(list.contains(sum)){
                int ans = list.indexOf(sum);
                System.out.println(ans);
                break;
            }

            temp = sum;
            list.add(sum);
            sum = 0;
        }

    }
}
