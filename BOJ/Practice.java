package algorithm.BOJ;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {



        int max = 0;
        int number = 100000000;
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = (int)(Math.random() * Integer.MAX_VALUE);
        }

        long before = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            max = Math.max(max, arr[i]);
        }

        long after = System.currentTimeMillis();

        System.out.println(max);
        System.out.println(after - before);
    }

    public static String A(int c, String d) {
        for (int j = 0; j < c; j++) {
            d += "*";
        }
        return d;

    }
}

