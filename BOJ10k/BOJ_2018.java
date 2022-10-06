package algorithm.BOJ10k;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2018 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        /*내코드
        int n = sc.nextInt();
        int answer = 1;

        for (int i = 1; i <= n / 2 ; i++) {
            int sum = 0;
            int temp = i;
            while(sum < n){
                sum += temp++;
                if(sum == n){
                    answer++;
                }
            }
        }
        System.out.println(answer);*/
        
        /* 투포인터 알고리즘*/
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while (end_index != N) {
            if (sum == N) {         //sum == N ->  End index++;  sum = sum + End index;  count++;
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {   //sum > N ->  sum = sum - Start index;  Start index++;
                sum = sum - start_index;
                start_index++;
            } else {                //sum < N ->  End index++;  sum = sum + End index;
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
        

    }
}
