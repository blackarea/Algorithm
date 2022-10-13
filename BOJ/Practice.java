package algorithm.BOJ;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Practice {
    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }

    public static String A(int c, String d) {
        for (int j = 0; j < c; j++) {
            d += "*";
        }
        return d;

    }

}

