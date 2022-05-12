package algorithm.BOJ10k;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        String[] arr = new String[st.length()];

        for (int i = 0; i < st.length(); i++) {
            arr[i] = st.substring(i);

        }

        Arrays.sort(arr);
        for (int i = 0; i < st.length(); i++) {
            System.out.println(arr[i]);
        }
    }
}
