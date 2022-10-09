package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = n - 1;
        int result = 0;

        Arrays.sort(arr);

        while (start < end){
            if(arr[start] + arr[end] < m){
                start++;
            }else if(arr[start] + arr[end] == m){
                result++;
                start++;
                end--;
            }else {
                end--;
            }
        }

        System.out.println(result);

    }
}
