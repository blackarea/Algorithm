package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int mul = a * b * c;
        int arr[] = new int[10];
        String temp = String.valueOf(mul);
        for (int i = 0; i < temp.length(); i++) {
            arr[temp.charAt(i)-'0']++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
