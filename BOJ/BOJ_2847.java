package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for (int i = n - 1; i > 0; i--) {
            if(arr[i] <= arr[i - 1]){
                int gap = arr[i - 1] - arr[i] + 1;
                arr[i - 1] -= gap;
                sum += gap;
            }
        }
        System.out.println(sum);
    }
}
