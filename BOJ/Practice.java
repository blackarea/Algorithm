package algorithm.BOJ;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

        System.out.println(A(3, "1"));
    }

    public static String A(int c, String d) {
        for (int j = 0; j < c; j++) {
            d += "*";
        }
        return d;

    }
}

