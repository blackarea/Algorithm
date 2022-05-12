package algorithm.BOJ10k;

import java.util.*;

public class BOJ_11652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int max = 1;
        Long result = null;
        int count = 1;


        n = sc.nextInt();
        long card[] = new long[n];

        for (int i = 0; i < n; i++) {
            card[i] = sc.nextLong();
        }

        Arrays.sort(card);

        result = card[0];
        for (int i = 1; i < n; i++) {
            if (card[i] == card[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (max < count) {
                max = count;
                result=card[i];
            }
        }

        System.out.println(result);

    }
}
