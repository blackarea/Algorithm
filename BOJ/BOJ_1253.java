package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int result = 0;


        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            if(start == i){
                start++;
            }
            if(end == i){
                end--;
            }
            while (start < end){
                if(arr[start] + arr[end] > arr[i]){
                    end--;
                }
                else if(arr[start] + arr[end] == arr[i]){
                    if(start != i && end != i){
                        result++;
                        break;
                    }else if(start == i) {
                        start++;
                    }else if(end == i) {
                        end--;
                    }
                }else {
                    start++;
                }
            }
        }
        System.out.println(result);

    }
}
