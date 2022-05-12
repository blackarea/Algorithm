package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = br.readLine();
        int y = 0;
        String temp = x;
        int sum = 0;

        while(true){
            if(temp.length() == 1){
                break;
            }
            for (int i = 0; i < temp.length(); i++) {
                y += temp.charAt(i) - '0';
            }
            temp = String.valueOf(y);
            y = 0;
            sum++;
        }

        System.out.println(sum);
        if (Integer.parseInt(temp) % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
