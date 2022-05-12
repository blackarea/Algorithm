package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum;
        int temp = 0;
        int i;
        for (i = 0; i < n; i++) {
            temp = i;
            sum = i;
            while(temp > 0){
                sum += temp % 10;
                temp/=10;
            }
            if(sum == n){
                break;
            }
        }

        if(i == n){
            System.out.println(0);
        }else{
            System.out.println(i);
        }
    }
}
