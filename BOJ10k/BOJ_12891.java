package algorithm.BOJ10k;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        int[] currentArr = new int[4];
        int[] checkArr = new int[4];
        st = new StringTokenizer(br.readLine());

        checkArr[0] = Integer.parseInt(st.nextToken());
        checkArr[1] = Integer.parseInt(st.nextToken());
        checkArr[2] = Integer.parseInt(st.nextToken());
        checkArr[3] = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < p; i++) {
            currentArr[AlphabetOrder(str.charAt(i))]++;
        }
        if (checkArr[0] <= currentArr[0] && checkArr[1] <= currentArr[1] &&
                checkArr[2] <= currentArr[2] && checkArr[3] <= currentArr[3]) {
            result++;
        }

        for (int i = p; i < s; i++) {
            currentArr[AlphabetOrder(str.charAt(i - p))]--;
            currentArr[AlphabetOrder(str.charAt(i))]++;

            if (checkArr[0] <= currentArr[0] && checkArr[1] <= currentArr[1] &&
                    checkArr[2] <= currentArr[2] && checkArr[3] <= currentArr[3]) {
                result++;
            }
        }

        System.out.println(result);

    }

    public static int AlphabetOrder(char c) {
        if (c == 'A') {
            return 0;
        }
        if (c == 'C') {
            return 1;
        }
        if (c == 'G') {
            return 2;
        }
        else{
            return 3;
        }
    }

}
