package algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            list.add(Integer.valueOf(n.charAt(i) - '0'));
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < n.length(); i++) {
            System.out.println(list.get(i));
        }


    }
}
