package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i) * b.get(i);
        }
        System.out.println(sum);


    }
}
