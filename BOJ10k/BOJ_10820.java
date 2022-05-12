package algorithm.BOJ10k;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        int[] arr;
        StringBuilder sb = new StringBuilder();

        while ((input = br.readLine()) != null) {
            arr = new int[4];
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    arr[0]++;
                }
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    arr[1]++;
                }
                if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                    arr[2]++;
                }
                if (input.charAt(i) == ' ') {
                    arr[3]++;
                }
            }
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            System.out.println(sb);
        }
    }
}
